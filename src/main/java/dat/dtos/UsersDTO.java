package dat.dtos;

import java.util.List;

public class UsersDTO
{
    List<UserDTO> data;
    int total;
    int page;
    int limit;

    public UsersDTO(List<UserDTO> data, int total, int page, int limit)
    {
        this.data = data;
        this.total = total;
        this.page = page;
        this.limit = limit;
    }

    @Override
    public String toString()
    {
        return "UsersDTO{" +
                "file.json=" + data +
                ", total=" + total +
                ", page=" + page +
                ", limit=" + limit +
                '}';
    }
}


