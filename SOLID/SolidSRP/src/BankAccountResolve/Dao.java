package BankAccountResolve;

public interface Dao {
	
	public void save(Persistable persistable);
	public Persistable retrieve(int id);
	public void update(Persistable persistable);

}
