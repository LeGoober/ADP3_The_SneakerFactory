package za.co.shinysneakers.service;

public interface IService<T, ID> {
    T create(T t);
    T read(ID id);
    T update(ID id, T t);
    boolean delete(ID id);
}
