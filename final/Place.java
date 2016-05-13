class Place {
	// Fields
	String name; double latitude; double longitude;
	// Constructor
	Place(String n, double lat, double lon) {
		name = n;
		latitude = lat;
		longitude = lon;
	}

	public String toString() {
		return (name + ": "+latitude+" N "+longitude+" W");
	}

	boolean isFurtherWestThan (Place x) {
		return (this.longitude > x.longitude);
	}
	boolean isFurtherNorthThan (Place x) {
		return (this.latitude > x.latitude);
	}
}