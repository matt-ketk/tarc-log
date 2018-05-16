package tarcLog;

import java.util.*;

public class Flight {
	private static final double MIN_TIME = 43;
	private static final double MAX_TIME = 46;
	
	// weather
	private double fahrenheit;
	private double windSpeed;
	private double humidity;

	// specifications
	private String payload;
	private String booster;
	private String motor;
	private int motorDelay;
	private String parachute;

	// masses
	private double payloadMass;
	private double boosterMass;
	private double[] eggs;
	private double parachuteMass;
	private double nomex;
	private double insulation;
	private double ballast;
	private double casing;
	private double motorMass;

	// results
	private int altitude;
	private double time;

	// notes
	private ArrayList<String> modifications;
	private ArrayList<String> damages;
	private ArrayList<String> characteristics;
	private ArrayList<String> considerations;

	public Flight() {
		// TODO: date
		this.fahrenheit = -460;
		this.windSpeed = -1;
		this.humidity = -1;

		this.payload = "";
		this.booster = "";
		this.motor = "";
		this.motorDelay = -1;
		this.parachute = "";

		this.payloadMass = -1;
		this.boosterMass = -1;
		this.parachuteMass = -1;
		this.nomex = -1;
		this.insulation = -1;
		this.ballast = -1;
		this.casing = -1;
		this.motorMass = -1;

		this.altitude = 0;
		this.time = 0;

		this.modifications = new ArrayList<String>();
		this.damages = new ArrayList<String>();
		this.characteristics = new ArrayList<String>();
		this.considerations = new ArrayList<String>();
	}

	// temperature
	public void setTemperature(double n) {
		this.fahrenheit = n;
	}

	public double getTemperature() {
		return this.fahrenheit;
	}

	// wind speed
	public void setWindSpeed(double n) {
		this.windSpeed = n;
	}

	public double getWindSpeed() {
		return this.windSpeed;
	}

	// humidity
	public void setHumidity(double n) {
		this.humidity = n;
	}

	public double getHumidity() {
		return this.humidity;
	}

	// payload
	public void setPayload(String s) {
		this.payload = s;
	}

	public String getPayload() {
		return this.payload;
	}

	// booster
	public void setBooster(String s) {
		this.booster = s;
	}

	public String getBooster() {
		return this.booster;
	}

	// motor
	public void setMotor(String s) {
		this.motor = s;
	}

	public String getMotor() {
		return this.motor;
	}

	// motor delay
	public void setDelay(int n) {
		this.motorDelay = n;
	}

	public int getDelay() {
		return this.motorDelay;
	}

	// parachute
	public void setParachute(String s) {
		this.parachute = s;
	}

	public String getParachute() {
		return this.parachute;
	}

	// payload mass
	public void setPayloadMass(double n) {
		this.payloadMass = n;
	}

	public double getPayloadMass() {
		return this.payloadMass;
	}

	// booster mass
	public void setBoosterMass(double n) {
		this.boosterMass = n;
	}

	public double getBoosterMass() {
		return this.boosterMass;
	}

	// eggs
	public void setEggAmount(int n) {
		this.eggs = new double[n];
	}

	public void setEggMass(int index, double n) {
		if (index >= 0 && index <= eggs.length - 1) {
			this.eggs[index] = n;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public double getEggMass(int index) {
		if (index >= 0 && index <= eggs.length - 1) {
			return this.eggs[index];
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public int getNumEggs() {
		return eggs.length;
	}

	// parachute mass
	public void setParachuteMass(double n) {
		this.parachuteMass = n;
	}

	public double getParachuteMass() {
		return this.parachuteMass;
	}

	// nomex
	public void setNomexMass(double n) {
		this.nomex = n;
	}

	public double getNomexMass() {
		return this.nomex;
	}

	// insulation
	public void setInsulationMass(double n) {
		this.insulation = n;
	}

	public double getInsulationMass() {
		return this.insulation;
	}

	// ballast
	public void setBallastMass(double n) {
		this.ballast = n;
	}

	public double getBallastMass() {
		return this.ballast;
	}

	// casing
	public void setCasingMass(double n) {
		this.casing = n;
	}

	public double getCasingMass() {
		return this.casing;
	}

	// motorMass
	public void setMotorMass(double n) {
		this.motorMass = n;
	}

	public double getMotorMass() {
		return this.motorMass;
	}

	// altitude
	public void setAltitude(int n) {
		this.altitude = n;
	}

	public int getAltitude() {
		return this.altitude;
	}

	// time
	public void setTime(double n) {
		this.time = n;
	}

	public double getTime() {
		return this.time;
	}

	// modifications
	public void addModification(String s) {
		modifications.add(s);
	}

	public String removeModification(int index) {
		if (index >= 0 && index <= modifications.size() - 1) {
			return modifications.remove(index);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public String getModification(int index) {
		if (index >= 0 && index <= modifications.size() - 1) {
			return modifications.get(index);
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public int getNumModifications() {
		return modifications.size();
	}

	// damages
	public void addDamage(String s) {
		damages.add(s);
	}

	public String removeDamage(int index) {
		if (index >= 0 && index <= damages.size() - 1) {
			return damages.remove(index);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public String getDamage(int index) {
		if (index >= 0 && index <= damages.size() - 1) {
			return damages.get(index);
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public int getNumDamages() {
		return damages.size();
	}

	// characteristics
	public void addcharacteristic(String s) {
		characteristics.add(s);
	}

	public String removeCharacteristic(int index) {
		if (index >= 0 && index <= characteristics.size() - 1) {
			return characteristics.remove(index);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public String getCharacteristic(int index) {
		if (index >= 0 && index <= characteristics.size() - 1) {
			return characteristics.get(index);
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public int getNumCharacteristics() {
		return characteristics.size();
	}

	// considerations
	public void addConsideration(String s) {
		considerations.add(s);
	}

	public String removeConsideration(int index) {
		if (index >= 0 && index <= considerations.size() - 1) {
			return considerations.remove(index);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public String getConsideration(int index) {
		if (index >= 0 && index <= considerations.size() - 1) {
			return considerations.get(index);
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public int getNumConsiderations() {
		return considerations.size();
	}
	
	public double getScore() {
		double score = -1;
		if (altitude > 0 && time > 0) {
			score = this.altitude;
			if (time < MIN_TIME) {
				score += (MIN_TIME - time);
			} else if (time > MAX_TIME) {
				score += (time - MAX_TIME);
			}
		}
		return score;
	}
	
	private double numCheck(double n) {
		if (n < 0)
			return 0;
		else
			return n;
	}
	
	public double getTotalMass() {
		double mass = -1;
		if (payloadMass > -1) {
			mass = numCheck(mass);
			mass += payloadMass;
		}
		if (boosterMass > -1) {
			mass = numCheck(mass);
			mass += boosterMass;
		}
		if (parachuteMass > -1) {
			mass = numCheck(mass);
			mass += parachuteMass;
		}
		if (nomex > -1) {
			mass = numCheck(mass);
			mass += nomex;
		}
		if (insulation > -1) {
			mass = numCheck(mass);
			mass += insulation;
		}
		if (ballast > -1) {
			mass = numCheck(mass);
			mass += ballast;
		}
		if (casing > -1) {
			mass = numCheck(mass);
			mass += casing;
		}
		if (motorMass > -1) {
			mass = numCheck(mass);
			mass += motorMass;
		}
		return mass;
	}

	public boolean isComplete() {
		return (fahrenheit > -460 && windSpeed > -1 && humidity > -1 && !payload.trim().equals("")
				&& !booster.trim().equals("") && !motor.trim().equals("") && motorDelay > -1
				&& !parachute.trim().equals("") && payloadMass > -1 && boosterMass > -1 && parachuteMass > -1
				&& nomex > -1 && insulation > -1 && ballast > -1 && casing > -1 && motorMass > -1 && altitude > 0
				&& time > 0 && modifications.size() > 0 && damages.size() > 0 && characteristics.size() > 0
				&& considerations.size() > 0);
	}
}