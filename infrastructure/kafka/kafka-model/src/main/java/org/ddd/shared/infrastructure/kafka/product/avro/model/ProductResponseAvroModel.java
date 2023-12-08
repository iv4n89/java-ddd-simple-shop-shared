/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.ddd.shared.infrastructure.kafka.product.avro.model;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class ProductResponseAvroModel extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2062796613150153169L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ProductResponseAvroModel\",\"namespace\":\"org.ddd.shared.infrastructure.kafka.product.avro.model\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"categoryId\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"price\",\"type\":{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":10,\"scale\":2}},{\"name\":\"isActive\",\"type\":\"boolean\"},{\"name\":\"failureMessages\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();
  static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.DecimalConversion());
  }

  private static final BinaryMessageEncoder<ProductResponseAvroModel> ENCODER =
      new BinaryMessageEncoder<ProductResponseAvroModel>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ProductResponseAvroModel> DECODER =
      new BinaryMessageDecoder<ProductResponseAvroModel>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ProductResponseAvroModel> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ProductResponseAvroModel> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ProductResponseAvroModel> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ProductResponseAvroModel>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ProductResponseAvroModel to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ProductResponseAvroModel from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ProductResponseAvroModel instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ProductResponseAvroModel fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.String id;
  private java.lang.String categoryId;
  private java.lang.String name;
  private java.math.BigDecimal price;
  private boolean isActive;
  private java.util.List<java.lang.String> failureMessages;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ProductResponseAvroModel() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param categoryId The new value for categoryId
   * @param name The new value for name
   * @param price The new value for price
   * @param isActive The new value for isActive
   * @param failureMessages The new value for failureMessages
   */
  public ProductResponseAvroModel(java.lang.String id, java.lang.String categoryId, java.lang.String name, java.math.BigDecimal price, java.lang.Boolean isActive, java.util.List<java.lang.String> failureMessages) {
    this.id = id;
    this.categoryId = categoryId;
    this.name = name;
    this.price = price;
    this.isActive = isActive;
    this.failureMessages = failureMessages;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return categoryId;
    case 2: return name;
    case 3: return price;
    case 4: return isActive;
    case 5: return failureMessages;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      null,
      null,
      null,
      new org.apache.avro.Conversions.DecimalConversion(),
      null,
      null,
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = value$ != null ? value$.toString() : null; break;
    case 1: categoryId = value$ != null ? value$.toString() : null; break;
    case 2: name = value$ != null ? value$.toString() : null; break;
    case 3: price = (java.math.BigDecimal)value$; break;
    case 4: isActive = (java.lang.Boolean)value$; break;
    case 5: failureMessages = (java.util.List<java.lang.String>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.String getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.String value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'categoryId' field.
   * @return The value of the 'categoryId' field.
   */
  public java.lang.String getCategoryId() {
    return categoryId;
  }


  /**
   * Sets the value of the 'categoryId' field.
   * @param value the value to set.
   */
  public void setCategoryId(java.lang.String value) {
    this.categoryId = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.String getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'price' field.
   * @return The value of the 'price' field.
   */
  public java.math.BigDecimal getPrice() {
    return price;
  }


  /**
   * Sets the value of the 'price' field.
   * @param value the value to set.
   */
  public void setPrice(java.math.BigDecimal value) {
    this.price = value;
  }

  /**
   * Gets the value of the 'isActive' field.
   * @return The value of the 'isActive' field.
   */
  public boolean getIsActive() {
    return isActive;
  }


  /**
   * Sets the value of the 'isActive' field.
   * @param value the value to set.
   */
  public void setIsActive(boolean value) {
    this.isActive = value;
  }

  /**
   * Gets the value of the 'failureMessages' field.
   * @return The value of the 'failureMessages' field.
   */
  public java.util.List<java.lang.String> getFailureMessages() {
    return failureMessages;
  }


  /**
   * Sets the value of the 'failureMessages' field.
   * @param value the value to set.
   */
  public void setFailureMessages(java.util.List<java.lang.String> value) {
    this.failureMessages = value;
  }

  /**
   * Creates a new ProductResponseAvroModel RecordBuilder.
   * @return A new ProductResponseAvroModel RecordBuilder
   */
  public static org.ddd.shared.infrastructure.kafka.product.avro.model.ProductResponseAvroModel.Builder newBuilder() {
    return new org.ddd.shared.infrastructure.kafka.product.avro.model.ProductResponseAvroModel.Builder();
  }

  /**
   * Creates a new ProductResponseAvroModel RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ProductResponseAvroModel RecordBuilder
   */
  public static org.ddd.shared.infrastructure.kafka.product.avro.model.ProductResponseAvroModel.Builder newBuilder(org.ddd.shared.infrastructure.kafka.product.avro.model.ProductResponseAvroModel.Builder other) {
    if (other == null) {
      return new org.ddd.shared.infrastructure.kafka.product.avro.model.ProductResponseAvroModel.Builder();
    } else {
      return new org.ddd.shared.infrastructure.kafka.product.avro.model.ProductResponseAvroModel.Builder(other);
    }
  }

  /**
   * Creates a new ProductResponseAvroModel RecordBuilder by copying an existing ProductResponseAvroModel instance.
   * @param other The existing instance to copy.
   * @return A new ProductResponseAvroModel RecordBuilder
   */
  public static org.ddd.shared.infrastructure.kafka.product.avro.model.ProductResponseAvroModel.Builder newBuilder(org.ddd.shared.infrastructure.kafka.product.avro.model.ProductResponseAvroModel other) {
    if (other == null) {
      return new org.ddd.shared.infrastructure.kafka.product.avro.model.ProductResponseAvroModel.Builder();
    } else {
      return new org.ddd.shared.infrastructure.kafka.product.avro.model.ProductResponseAvroModel.Builder(other);
    }
  }

  /**
   * RecordBuilder for ProductResponseAvroModel instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ProductResponseAvroModel>
    implements org.apache.avro.data.RecordBuilder<ProductResponseAvroModel> {

    private java.lang.String id;
    private java.lang.String categoryId;
    private java.lang.String name;
    private java.math.BigDecimal price;
    private boolean isActive;
    private java.util.List<java.lang.String> failureMessages;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.ddd.shared.infrastructure.kafka.product.avro.model.ProductResponseAvroModel.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.categoryId)) {
        this.categoryId = data().deepCopy(fields()[1].schema(), other.categoryId);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.name)) {
        this.name = data().deepCopy(fields()[2].schema(), other.name);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.price)) {
        this.price = data().deepCopy(fields()[3].schema(), other.price);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.isActive)) {
        this.isActive = data().deepCopy(fields()[4].schema(), other.isActive);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.failureMessages)) {
        this.failureMessages = data().deepCopy(fields()[5].schema(), other.failureMessages);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing ProductResponseAvroModel instance
     * @param other The existing instance to copy.
     */
    private Builder(org.ddd.shared.infrastructure.kafka.product.avro.model.ProductResponseAvroModel other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.categoryId)) {
        this.categoryId = data().deepCopy(fields()[1].schema(), other.categoryId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.name)) {
        this.name = data().deepCopy(fields()[2].schema(), other.name);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.price)) {
        this.price = data().deepCopy(fields()[3].schema(), other.price);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.isActive)) {
        this.isActive = data().deepCopy(fields()[4].schema(), other.isActive);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.failureMessages)) {
        this.failureMessages = data().deepCopy(fields()[5].schema(), other.failureMessages);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.String getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public org.ddd.shared.infrastructure.kafka.product.avro.model.ProductResponseAvroModel.Builder setId(java.lang.String value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public org.ddd.shared.infrastructure.kafka.product.avro.model.ProductResponseAvroModel.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'categoryId' field.
      * @return The value.
      */
    public java.lang.String getCategoryId() {
      return categoryId;
    }


    /**
      * Sets the value of the 'categoryId' field.
      * @param value The value of 'categoryId'.
      * @return This builder.
      */
    public org.ddd.shared.infrastructure.kafka.product.avro.model.ProductResponseAvroModel.Builder setCategoryId(java.lang.String value) {
      validate(fields()[1], value);
      this.categoryId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'categoryId' field has been set.
      * @return True if the 'categoryId' field has been set, false otherwise.
      */
    public boolean hasCategoryId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'categoryId' field.
      * @return This builder.
      */
    public org.ddd.shared.infrastructure.kafka.product.avro.model.ProductResponseAvroModel.Builder clearCategoryId() {
      categoryId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.String getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public org.ddd.shared.infrastructure.kafka.product.avro.model.ProductResponseAvroModel.Builder setName(java.lang.String value) {
      validate(fields()[2], value);
      this.name = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public org.ddd.shared.infrastructure.kafka.product.avro.model.ProductResponseAvroModel.Builder clearName() {
      name = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'price' field.
      * @return The value.
      */
    public java.math.BigDecimal getPrice() {
      return price;
    }


    /**
      * Sets the value of the 'price' field.
      * @param value The value of 'price'.
      * @return This builder.
      */
    public org.ddd.shared.infrastructure.kafka.product.avro.model.ProductResponseAvroModel.Builder setPrice(java.math.BigDecimal value) {
      validate(fields()[3], value);
      this.price = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'price' field has been set.
      * @return True if the 'price' field has been set, false otherwise.
      */
    public boolean hasPrice() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'price' field.
      * @return This builder.
      */
    public org.ddd.shared.infrastructure.kafka.product.avro.model.ProductResponseAvroModel.Builder clearPrice() {
      price = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'isActive' field.
      * @return The value.
      */
    public boolean getIsActive() {
      return isActive;
    }


    /**
      * Sets the value of the 'isActive' field.
      * @param value The value of 'isActive'.
      * @return This builder.
      */
    public org.ddd.shared.infrastructure.kafka.product.avro.model.ProductResponseAvroModel.Builder setIsActive(boolean value) {
      validate(fields()[4], value);
      this.isActive = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'isActive' field has been set.
      * @return True if the 'isActive' field has been set, false otherwise.
      */
    public boolean hasIsActive() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'isActive' field.
      * @return This builder.
      */
    public org.ddd.shared.infrastructure.kafka.product.avro.model.ProductResponseAvroModel.Builder clearIsActive() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'failureMessages' field.
      * @return The value.
      */
    public java.util.List<java.lang.String> getFailureMessages() {
      return failureMessages;
    }


    /**
      * Sets the value of the 'failureMessages' field.
      * @param value The value of 'failureMessages'.
      * @return This builder.
      */
    public org.ddd.shared.infrastructure.kafka.product.avro.model.ProductResponseAvroModel.Builder setFailureMessages(java.util.List<java.lang.String> value) {
      validate(fields()[5], value);
      this.failureMessages = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'failureMessages' field has been set.
      * @return True if the 'failureMessages' field has been set, false otherwise.
      */
    public boolean hasFailureMessages() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'failureMessages' field.
      * @return This builder.
      */
    public org.ddd.shared.infrastructure.kafka.product.avro.model.ProductResponseAvroModel.Builder clearFailureMessages() {
      failureMessages = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ProductResponseAvroModel build() {
      try {
        ProductResponseAvroModel record = new ProductResponseAvroModel();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.String) defaultValue(fields()[0]);
        record.categoryId = fieldSetFlags()[1] ? this.categoryId : (java.lang.String) defaultValue(fields()[1]);
        record.name = fieldSetFlags()[2] ? this.name : (java.lang.String) defaultValue(fields()[2]);
        record.price = fieldSetFlags()[3] ? this.price : (java.math.BigDecimal) defaultValue(fields()[3]);
        record.isActive = fieldSetFlags()[4] ? this.isActive : (java.lang.Boolean) defaultValue(fields()[4]);
        record.failureMessages = fieldSetFlags()[5] ? this.failureMessages : (java.util.List<java.lang.String>) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ProductResponseAvroModel>
    WRITER$ = (org.apache.avro.io.DatumWriter<ProductResponseAvroModel>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ProductResponseAvroModel>
    READER$ = (org.apache.avro.io.DatumReader<ProductResponseAvroModel>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










