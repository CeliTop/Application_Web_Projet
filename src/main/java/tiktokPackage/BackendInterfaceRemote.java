package tiktokPackage;

import java.util.Collection;

import javax.ejb.Remote;

@Remote
public interface BackendInterfaceRemote {
	public boolean addCompte(Compte c);
	public Compte getCompte(int id);
	public Collection<Compte> getAllComptes();
	public Video posterVideo(Compte c, Video video);
	public Video getRandomVIdeo();
	public Video getVideoFromID(int id);
	public Compte login(Compte c);
}
