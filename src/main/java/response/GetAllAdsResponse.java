package response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetAllAdsResponse {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("version")
    @Expose
    private Integer version;
    @SerializedName("author")
    @Expose
    private Author author;
    @SerializedName("agencies")
    @Expose
    private List<Object> agencies = null;
    @SerializedName("date_updated")
    @Expose
    private Object dateUpdated;
    @SerializedName("date_publicated")
    @Expose
    private String datePublicated;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("permalink")
    @Expose
    private String permalink;
    @SerializedName("price")
    @Expose
    private List<Price> price = null;
    @SerializedName("active")
    @Expose
    private Integer active;
    @SerializedName("date_overhaul")
    @Expose
    private Object dateOverhaul;
    @SerializedName("mileage")
    @Expose
    private Integer mileage;
    @SerializedName("custom_color")
    @Expose
    private Object customColor;
    @SerializedName("mileage_unit")
    @Expose
    private Integer mileageUnit;
    @SerializedName("capacity")
    @Expose
    private Integer capacity;
    @SerializedName("capacity_unit")
    @Expose
    private Integer capacityUnit;
    @SerializedName("power")
    @Expose
    private Integer power;
    @SerializedName("power_unit")
    @Expose
    private Integer powerUnit;
    @SerializedName("gears")
    @Expose
    private Object gears;
    @SerializedName("seats")
    @Expose
    private Object seats;
    @SerializedName("migrated")
    @Expose
    private Boolean migrated;
    @SerializedName("is_new")
    @Expose
    private Boolean isNew;
    @SerializedName("is_rent")
    @Expose
    private Boolean isRent;
    @SerializedName("is_cashless")
    @Expose
    private Boolean isCashless;
    @SerializedName("is_swap")
    @Expose
    private Boolean isSwap;
    @SerializedName("is_crashed")
    @Expose
    private Boolean isCrashed;
    @SerializedName("is_not_cleared")
    @Expose
    private Boolean isNotCleared;
    @SerializedName("is_sale_on_credit")
    @Expose
    private Boolean isSaleOnCredit;
    @SerializedName("is_under_loan")
    @Expose
    private Boolean isUnderLoan;
    @SerializedName("from_auction")
    @Expose
    private Boolean fromAuction;
    @SerializedName("checked")
    @Expose
    private Boolean checked;
    @SerializedName("sold")
    @Expose
    private Boolean sold;
    @SerializedName("date_created")
    @Expose
    private String dateCreated;
    @SerializedName("make")
    @Expose
    private Make make;
    @SerializedName("model")
    @Expose
    private Model model;
    @SerializedName("year")
    @Expose
    private Integer year;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("driven_from")
    @Expose
    private DrivenFrom drivenFrom;
    @SerializedName("currency")
    @Expose
    private Currency currency;
    @SerializedName("ecotype")
    @Expose
    private Ecotype ecotype;
    @SerializedName("color")
    @Expose
    private Color color;
    @SerializedName("transport")
    @Expose
    private Transport transport;
    @SerializedName("category")
    @Expose
    private Category category;
    @SerializedName("features")
    @Expose
    private List<Feature> features = null;
    @SerializedName("engine_features")
    @Expose
    private List<Object> engineFeatures = null;
    @SerializedName("color_features")
    @Expose
    private List<ColorFeature> colorFeatures = null;
    @SerializedName("options")
    @Expose
    private List<Object> options = null;
    @SerializedName("modification")
    @Expose
    private Modification modification;
    @SerializedName("characteristics")
    @Expose
    private Characteristics characteristics;
    @SerializedName("photos")
    @Expose
    private List<Photo> photos = null;
    @SerializedName("hot_date")
    @Expose
    private String hotDate;
    @SerializedName("vip_date")
    @Expose
    private Object vipDate;
    @SerializedName("color_date")
    @Expose
    private Object colorDate;
    @SerializedName("top_date")
    @Expose
    private Object topDate;
    @SerializedName("vin")
    @Expose
    private Object vin;
    @SerializedName("promotional")
    @Expose
    private Boolean promotional;
    @SerializedName("gas_equipment")
    @Expose
    private Boolean gasEquipment;
    @SerializedName("from_europe")
    @Expose
    private Boolean fromEurope;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("views_count")
    @Expose
    private Integer viewsCount;
    @SerializedName("tacts")
    @Expose
    private Tacts tacts;
    @SerializedName("cooling")
    @Expose
    private Cooling cooling;
    @SerializedName("engine_order")
    @Expose
    private EngineOrder engineOrder;
    @SerializedName("unloading")
    @Expose
    private Unloading unloading;
    @SerializedName("categories_width")
    @Expose
    private CategoriesWidth categoriesWidth;
    @SerializedName("categories_height")
    @Expose
    private CategoriesHeight categoriesHeight;
    @SerializedName("brake_rear")
    @Expose
    private BrakeRear brakeRear;
    @SerializedName("brake_front")
    @Expose
    private BrakeFront brakeFront;
    @SerializedName("range_type")
    @Expose
    private RangeType rangeType;
    @SerializedName("engine")
    @Expose
    private Engine_ engine;
    @SerializedName("drive")
    @Expose
    private Drive drive;
    @SerializedName("gearbox")
    @Expose
    private Gearbox_ gearbox;
    @SerializedName("contact_name")
    @Expose
    private Object contactName;
    @SerializedName("fueltank_capacity")
    @Expose
    private Object fueltankCapacity;
    @SerializedName("flowrate")
    @Expose
    private Object flowrate;
    @SerializedName("tonnage")
    @Expose
    private Object tonnage;
    @SerializedName("accessibility")
    @Expose
    private Object accessibility;
    @SerializedName("productivity")
    @Expose
    private Object productivity;
    @SerializedName("caterpillars_width")
    @Expose
    private Object caterpillarsWidth;
    @SerializedName("dimension_width")
    @Expose
    private Object dimensionWidth;
    @SerializedName("dimension_length")
    @Expose
    private Object dimensionLength;
    @SerializedName("dimension_height")
    @Expose
    private Object dimensionHeight;
    @SerializedName("dimension_weight")
    @Expose
    private Object dimensionWeight;
    @SerializedName("capacity_body")
    @Expose
    private Object capacityBody;
    @SerializedName("capacity_bucket")
    @Expose
    private Object capacityBucket;
    @SerializedName("bucket_count")
    @Expose
    private Object bucketCount;
    @SerializedName("laying_width")
    @Expose
    private Object layingWidth;
    @SerializedName("lift_height")
    @Expose
    private Object liftHeight;
    @SerializedName("admission_height")
    @Expose
    private Object admissionHeight;
    @SerializedName("condition")
    @Expose
    private Condition condition;
    @SerializedName("arm_boom")
    @Expose
    private Object armBoom;
    @SerializedName("dep_big")
    @Expose
    private Object depBig;
    @SerializedName("axises")
    @Expose
    private Object axises;
    @SerializedName("gearbox_with_dividers")
    @Expose
    private Object gearboxWithDividers;
    @SerializedName("fueltanks_capacity")
    @Expose
    private Object fueltanksCapacity;
    @SerializedName("fueltanks_count")
    @Expose
    private Object fueltanksCount;
    @SerializedName("cabin")
    @Expose
    private Cabin cabin;
    @SerializedName("couchettes")
    @Expose
    private Object couchettes;
    @SerializedName("is_bdf")
    @Expose
    private Object isBdf;
    @SerializedName("crane_arm")
    @Expose
    private Object craneArm;
    @SerializedName("palets")
    @Expose
    private Object palets;
    @SerializedName("brakes")
    @Expose
    private Brakes brakes;
    @SerializedName("suspension")
    @Expose
    private Suspension suspension;
    @SerializedName("chassis_suspension")
    @Expose
    private ChassisSuspension chassisSuspension;
    @SerializedName("cabin_suspension")
    @Expose
    private CabinSuspension cabinSuspension;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Object> getAgencies() {
        return agencies;
    }

    public void setAgencies(List<Object> agencies) {
        this.agencies = agencies;
    }

    public Object getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Object dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public String getDatePublicated() {
        return datePublicated;
    }

    public void setDatePublicated(String datePublicated) {
        this.datePublicated = datePublicated;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public List<Price> getPrice() {
        return price;
    }

    public void setPrice(List<Price> price) {
        this.price = price;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Object getDateOverhaul() {
        return dateOverhaul;
    }

    public void setDateOverhaul(Object dateOverhaul) {
        this.dateOverhaul = dateOverhaul;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Object getCustomColor() {
        return customColor;
    }

    public void setCustomColor(Object customColor) {
        this.customColor = customColor;
    }

    public Integer getMileageUnit() {
        return mileageUnit;
    }

    public void setMileageUnit(Integer mileageUnit) {
        this.mileageUnit = mileageUnit;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getCapacityUnit() {
        return capacityUnit;
    }

    public void setCapacityUnit(Integer capacityUnit) {
        this.capacityUnit = capacityUnit;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getPowerUnit() {
        return powerUnit;
    }

    public void setPowerUnit(Integer powerUnit) {
        this.powerUnit = powerUnit;
    }

    public Object getGears() {
        return gears;
    }

    public void setGears(Object gears) {
        this.gears = gears;
    }

    public Object getSeats() {
        return seats;
    }

    public void setSeats(Object seats) {
        this.seats = seats;
    }

    public Boolean getMigrated() {
        return migrated;
    }

    public void setMigrated(Boolean migrated) {
        this.migrated = migrated;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public Boolean getIsRent() {
        return isRent;
    }

    public void setIsRent(Boolean isRent) {
        this.isRent = isRent;
    }

    public Boolean getIsCashless() {
        return isCashless;
    }

    public void setIsCashless(Boolean isCashless) {
        this.isCashless = isCashless;
    }

    public Boolean getIsSwap() {
        return isSwap;
    }

    public void setIsSwap(Boolean isSwap) {
        this.isSwap = isSwap;
    }

    public Boolean getIsCrashed() {
        return isCrashed;
    }

    public void setIsCrashed(Boolean isCrashed) {
        this.isCrashed = isCrashed;
    }

    public Boolean getIsNotCleared() {
        return isNotCleared;
    }

    public void setIsNotCleared(Boolean isNotCleared) {
        this.isNotCleared = isNotCleared;
    }

    public Boolean getIsSaleOnCredit() {
        return isSaleOnCredit;
    }

    public void setIsSaleOnCredit(Boolean isSaleOnCredit) {
        this.isSaleOnCredit = isSaleOnCredit;
    }

    public Boolean getIsUnderLoan() {
        return isUnderLoan;
    }

    public void setIsUnderLoan(Boolean isUnderLoan) {
        this.isUnderLoan = isUnderLoan;
    }

    public Boolean getFromAuction() {
        return fromAuction;
    }

    public void setFromAuction(Boolean fromAuction) {
        this.fromAuction = fromAuction;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public Boolean getSold() {
        return sold;
    }

    public void setSold(Boolean sold) {
        this.sold = sold;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Make getMake() {
        return make;
    }

    public void setMake(Make make) {
        this.make = make;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public DrivenFrom getDrivenFrom() {
        return drivenFrom;
    }

    public void setDrivenFrom(DrivenFrom drivenFrom) {
        this.drivenFrom = drivenFrom;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Ecotype getEcotype() {
        return ecotype;
    }

    public void setEcotype(Ecotype ecotype) {
        this.ecotype = ecotype;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public List<Object> getEngineFeatures() {
        return engineFeatures;
    }

    public void setEngineFeatures(List<Object> engineFeatures) {
        this.engineFeatures = engineFeatures;
    }

    public List<ColorFeature> getColorFeatures() {
        return colorFeatures;
    }

    public void setColorFeatures(List<ColorFeature> colorFeatures) {
        this.colorFeatures = colorFeatures;
    }

    public List<Object> getOptions() {
        return options;
    }

    public void setOptions(List<Object> options) {
        this.options = options;
    }

    public Modification getModification() {
        return modification;
    }

    public void setModification(Modification modification) {
        this.modification = modification;
    }

    public Characteristics getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(Characteristics characteristics) {
        this.characteristics = characteristics;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public String getHotDate() {
        return hotDate;
    }

    public void setHotDate(String hotDate) {
        this.hotDate = hotDate;
    }

    public Object getVipDate() {
        return vipDate;
    }

    public void setVipDate(Object vipDate) {
        this.vipDate = vipDate;
    }

    public Object getColorDate() {
        return colorDate;
    }

    public void setColorDate(Object colorDate) {
        this.colorDate = colorDate;
    }

    public Object getTopDate() {
        return topDate;
    }

    public void setTopDate(Object topDate) {
        this.topDate = topDate;
    }

    public Object getVin() {
        return vin;
    }

    public void setVin(Object vin) {
        this.vin = vin;
    }

    public Boolean getPromotional() {
        return promotional;
    }

    public void setPromotional(Boolean promotional) {
        this.promotional = promotional;
    }

    public Boolean getGasEquipment() {
        return gasEquipment;
    }

    public void setGasEquipment(Boolean gasEquipment) {
        this.gasEquipment = gasEquipment;
    }

    public Boolean getFromEurope() {
        return fromEurope;
    }

    public void setFromEurope(Boolean fromEurope) {
        this.fromEurope = fromEurope;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getViewsCount() {
        return viewsCount;
    }

    public void setViewsCount(Integer viewsCount) {
        this.viewsCount = viewsCount;
    }

    public Tacts getTacts() {
        return tacts;
    }

    public void setTacts(Tacts tacts) {
        this.tacts = tacts;
    }

    public Cooling getCooling() {
        return cooling;
    }

    public void setCooling(Cooling cooling) {
        this.cooling = cooling;
    }

    public EngineOrder getEngineOrder() {
        return engineOrder;
    }

    public void setEngineOrder(EngineOrder engineOrder) {
        this.engineOrder = engineOrder;
    }

    public Unloading getUnloading() {
        return unloading;
    }

    public void setUnloading(Unloading unloading) {
        this.unloading = unloading;
    }

    public CategoriesWidth getCategoriesWidth() {
        return categoriesWidth;
    }

    public void setCategoriesWidth(CategoriesWidth categoriesWidth) {
        this.categoriesWidth = categoriesWidth;
    }

    public CategoriesHeight getCategoriesHeight() {
        return categoriesHeight;
    }

    public void setCategoriesHeight(CategoriesHeight categoriesHeight) {
        this.categoriesHeight = categoriesHeight;
    }

    public BrakeRear getBrakeRear() {
        return brakeRear;
    }

    public void setBrakeRear(BrakeRear brakeRear) {
        this.brakeRear = brakeRear;
    }

    public BrakeFront getBrakeFront() {
        return brakeFront;
    }

    public void setBrakeFront(BrakeFront brakeFront) {
        this.brakeFront = brakeFront;
    }

    public RangeType getRangeType() {
        return rangeType;
    }

    public void setRangeType(RangeType rangeType) {
        this.rangeType = rangeType;
    }

    public Engine_ getEngine() {
        return engine;
    }

    public void setEngine(Engine_ engine) {
        this.engine = engine;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public Gearbox_ getGearbox() {
        return gearbox;
    }

    public void setGearbox(Gearbox_ gearbox) {
        this.gearbox = gearbox;
    }

    public Object getContactName() {
        return contactName;
    }

    public void setContactName(Object contactName) {
        this.contactName = contactName;
    }

    public Object getFueltankCapacity() {
        return fueltankCapacity;
    }

    public void setFueltankCapacity(Object fueltankCapacity) {
        this.fueltankCapacity = fueltankCapacity;
    }

    public Object getFlowrate() {
        return flowrate;
    }

    public void setFlowrate(Object flowrate) {
        this.flowrate = flowrate;
    }

    public Object getTonnage() {
        return tonnage;
    }

    public void setTonnage(Object tonnage) {
        this.tonnage = tonnage;
    }

    public Object getAccessibility() {
        return accessibility;
    }

    public void setAccessibility(Object accessibility) {
        this.accessibility = accessibility;
    }

    public Object getProductivity() {
        return productivity;
    }

    public void setProductivity(Object productivity) {
        this.productivity = productivity;
    }

    public Object getCaterpillarsWidth() {
        return caterpillarsWidth;
    }

    public void setCaterpillarsWidth(Object caterpillarsWidth) {
        this.caterpillarsWidth = caterpillarsWidth;
    }

    public Object getDimensionWidth() {
        return dimensionWidth;
    }

    public void setDimensionWidth(Object dimensionWidth) {
        this.dimensionWidth = dimensionWidth;
    }

    public Object getDimensionLength() {
        return dimensionLength;
    }

    public void setDimensionLength(Object dimensionLength) {
        this.dimensionLength = dimensionLength;
    }

    public Object getDimensionHeight() {
        return dimensionHeight;
    }

    public void setDimensionHeight(Object dimensionHeight) {
        this.dimensionHeight = dimensionHeight;
    }

    public Object getDimensionWeight() {
        return dimensionWeight;
    }

    public void setDimensionWeight(Object dimensionWeight) {
        this.dimensionWeight = dimensionWeight;
    }

    public Object getCapacityBody() {
        return capacityBody;
    }

    public void setCapacityBody(Object capacityBody) {
        this.capacityBody = capacityBody;
    }

    public Object getCapacityBucket() {
        return capacityBucket;
    }

    public void setCapacityBucket(Object capacityBucket) {
        this.capacityBucket = capacityBucket;
    }

    public Object getBucketCount() {
        return bucketCount;
    }

    public void setBucketCount(Object bucketCount) {
        this.bucketCount = bucketCount;
    }

    public Object getLayingWidth() {
        return layingWidth;
    }

    public void setLayingWidth(Object layingWidth) {
        this.layingWidth = layingWidth;
    }

    public Object getLiftHeight() {
        return liftHeight;
    }

    public void setLiftHeight(Object liftHeight) {
        this.liftHeight = liftHeight;
    }

    public Object getAdmissionHeight() {
        return admissionHeight;
    }

    public void setAdmissionHeight(Object admissionHeight) {
        this.admissionHeight = admissionHeight;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Object getArmBoom() {
        return armBoom;
    }

    public void setArmBoom(Object armBoom) {
        this.armBoom = armBoom;
    }

    public Object getDepBig() {
        return depBig;
    }

    public void setDepBig(Object depBig) {
        this.depBig = depBig;
    }

    public Object getAxises() {
        return axises;
    }

    public void setAxises(Object axises) {
        this.axises = axises;
    }

    public Object getGearboxWithDividers() {
        return gearboxWithDividers;
    }

    public void setGearboxWithDividers(Object gearboxWithDividers) {
        this.gearboxWithDividers = gearboxWithDividers;
    }

    public Object getFueltanksCapacity() {
        return fueltanksCapacity;
    }

    public void setFueltanksCapacity(Object fueltanksCapacity) {
        this.fueltanksCapacity = fueltanksCapacity;
    }

    public Object getFueltanksCount() {
        return fueltanksCount;
    }

    public void setFueltanksCount(Object fueltanksCount) {
        this.fueltanksCount = fueltanksCount;
    }

    public Cabin getCabin() {
        return cabin;
    }

    public void setCabin(Cabin cabin) {
        this.cabin = cabin;
    }

    public Object getCouchettes() {
        return couchettes;
    }

    public void setCouchettes(Object couchettes) {
        this.couchettes = couchettes;
    }

    public Object getIsBdf() {
        return isBdf;
    }

    public void setIsBdf(Object isBdf) {
        this.isBdf = isBdf;
    }

    public Object getCraneArm() {
        return craneArm;
    }

    public void setCraneArm(Object craneArm) {
        this.craneArm = craneArm;
    }

    public Object getPalets() {
        return palets;
    }

    public void setPalets(Object palets) {
        this.palets = palets;
    }

    public Brakes getBrakes() {
        return brakes;
    }

    public void setBrakes(Brakes brakes) {
        this.brakes = brakes;
    }

    public Suspension getSuspension() {
        return suspension;
    }

    public void setSuspension(Suspension suspension) {
        this.suspension = suspension;
    }

    public ChassisSuspension getChassisSuspension() {
        return chassisSuspension;
    }

    public void setChassisSuspension(ChassisSuspension chassisSuspension) {
        this.chassisSuspension = chassisSuspension;
    }

    public CabinSuspension getCabinSuspension() {
        return cabinSuspension;
    }

    public void setCabinSuspension(CabinSuspension cabinSuspension) {
        this.cabinSuspension = cabinSuspension;
    }

}
