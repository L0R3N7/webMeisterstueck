# webMeisterstück

## Aufgabenstellung
- Erstellen Sie eine CMS - Website in der unter anderem dynamische Daten angezeigt werden, die mit REST von einem Applikationserver geladen werden. 
- Hosten Sie diese Website in der LeoCloud (max 87P) 
- Optional: verwenden Sie github actions, um die Website automatisch in Github Pages zu deployen (13P) geben Sie ein .pdf ab, in der der Link zur Webseite und der Link zu Ihrem github Repo enthalten ist.

Tipp: [webpack](https://github.com/caberger/webpack-demo) enthält schon das meiste, das Sie benötigen. Die nginx dort liest den HTML-Inhalt von einem PersistentVolume. Dort tauschen Sie die bestehende index.html aus durch den Content, den Hugo erzeugt.