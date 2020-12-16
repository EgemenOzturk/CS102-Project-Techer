package com.example.techer;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class AdapterPosts extends RecyclerView.Adapter<AdapterPosts.MyHolder> {
    Context context;
    List<ModalPost> postList;

    public AdapterPosts(Context context, List<ModalPost> postList) {
        this.context = context;
        this.postList = postList;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_posts,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        String uName = postList.get(position).getUserName() + " " + postList.get(position).getUserSurname();
        String uTitle = postList.get(position).getUserTitle();
        String uEmail = postList.get(position).getUserEmail();
        String uDescription = postList.get(position).getUserDescription();
        String uTimestamp = postList.get(position).getUserTimestamp();

        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        calendar.setTimeInMillis(Long.parseLong(uTimestamp));
        String pTime = DateFormat.format("dd/MM/yyyy hh:mm aa",calendar).toString();

        holder.userPostName.setText(uName);
        holder.userPostDate.setText(pTime);
        holder.userPostTitle.setText(uTitle);
        holder.userPostDescription.setText(uDescription);

        holder.likeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Liked", Toast.LENGTH_SHORT).show();
                holder.likeButton.setEnabled(false);
                holder.dislikeButton.setEnabled(true);
            }
        });
        holder.dislikeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Disliked", Toast.LENGTH_SHORT).show();
                holder.likeButton.setEnabled(true);
                holder.dislikeButton.setEnabled(false);
            }
        });
        holder.commentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Comment", Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public int getItemCount() {
        return postList.size();
    }

    class MyHolder extends RecyclerView.ViewHolder{

        Button likeButton, commentButton, dislikeButton;
        TextView userPostName, userPostDate, userPostTitle, userPostDescription, userPostLikes, userPostDislikes;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            likeButton = itemView.findViewById(R.id.likeButton);
            commentButton = itemView.findViewById(R.id.commentButton);
            dislikeButton = itemView.findViewById(R.id.dislikeButton);
            userPostName = itemView.findViewById(R.id.userPostName);
            userPostDate = itemView.findViewById(R.id.userPostDate);
            userPostTitle = itemView.findViewById(R.id.userPostTitle);
            userPostDescription = itemView.findViewById(R.id.userPostDescription);
            userPostLikes = itemView.findViewById(R.id.userPostLikes);
            userPostDislikes = itemView.findViewById(R.id.userPostDislikes);
        }
    }
}

