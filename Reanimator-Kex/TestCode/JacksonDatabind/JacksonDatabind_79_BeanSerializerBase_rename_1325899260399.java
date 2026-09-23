package com.fasterxml.jackson.databind.ser.std;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.ser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class BeanSerializerBase_rename_1325899260399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187660;
     Object term190201;

    public BeanSerializerBase_rename_1325899260399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term191699 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.NumberSerializers$FloatSerializer");
        Field term189865 = ((Class) term191699).getDeclaredField((String) "instance");
        ((Field) term189865).setAccessible(false);
        term187660 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 207);
        Object term189677 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term189775 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term189977 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term190089 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        setField(term189775, term189775.getClass(), "_value", "");
        setField(term189677, term189677.getClass(), "_name", term189775);
        setField(term189677, term189677.getClass(), "_metadata", null);
        setField(term189677, term189677.getClass(), "_format", null);
        setField(term189677, term189677.getClass(), "_wrapperName", null);
        setField(term189677, term189677.getClass(), "_contextAnnotations", null);
        setField(term189677, term189677.getClass(), "_declaredType", null);
        setField(term189677, term189677.getClass(), "_member", null);
        setField(term189677, term189677.getClass(), "_accessorMethod", null);
        setField(term189677, term189677.getClass(), "_field", term189865);
        setField(term189677, term189677.getClass(), "_serializer", null);
        setField(term189677, term189677.getClass(), "_nullSerializer", null);
        setField(term189677, term189677.getClass(), "_internalSettings", null);
        setField(term189677, term189677.getClass(), "_cfgSerializationType", null);
        setField(term189677, term189677.getClass(), "_dynamicSerializers", null);
        setBooleanField(term189677, term189677.getClass(), "_suppressNulls", false);
        setField(term189677, term189677.getClass(), "_suppressableValue", null);
        setField(term189677, term189677.getClass(), "_includeInViews", null);
        setField(term189677, term189677.getClass(), "_typeSerializer", null);
        setField(term189677, term189677.getClass(), "_nonTrivialBaseType", null);
        setElement(term187660, 58, term189677);
        setElement(term187660, 101, term189977);
        setField(term190089, term190089.getClass(), "_name", null);
        setField(term190089, term190089.getClass(), "_metadata", null);
        setField(term190089, term190089.getClass(), "_format", null);
        setField(term190089, term190089.getClass(), "_wrapperName", null);
        setField(term190089, term190089.getClass(), "_contextAnnotations", null);
        setField(term190089, term190089.getClass(), "_declaredType", null);
        setField(term190089, term190089.getClass(), "_member", null);
        setField(term190089, term190089.getClass(), "_accessorMethod", null);
        setField(term190089, term190089.getClass(), "_field", null);
        setField(term190089, term190089.getClass(), "_serializer", null);
        setField(term190089, term190089.getClass(), "_nullSerializer", null);
        setField(term190089, term190089.getClass(), "_internalSettings", null);
        setField(term190089, term190089.getClass(), "_cfgSerializationType", null);
        setField(term190089, term190089.getClass(), "_dynamicSerializers", null);
        setBooleanField(term190089, term190089.getClass(), "_suppressNulls", false);
        setField(term190089, term190089.getClass(), "_suppressableValue", null);
        setField(term190089, term190089.getClass(), "_includeInViews", null);
        setField(term190089, term190089.getClass(), "_typeSerializer", null);
        setField(term190089, term190089.getClass(), "_nonTrivialBaseType", null);
        setElement(term187660, 102, term190089);
        setElement(term187660, 103, term190089);
        setElement(term187660, 104, term190089);
        setElement(term187660, 105, term190089);
        setElement(term187660, 106, term190089);
        setElement(term187660, 107, term190089);
        setElement(term187660, 108, term190089);
        setElement(term187660, 109, term190089);
        setElement(term187660, 110, term190089);
        setElement(term187660, 111, term190089);
        setElement(term187660, 112, term190089);
        setElement(term187660, 113, term190089);
        setElement(term187660, 114, term190089);
        setElement(term187660, 115, term190089);
        setElement(term187660, 116, term190089);
        setElement(term187660, 117, term190089);
        setElement(term187660, 118, term190089);
        setElement(term187660, 119, term190089);
        setElement(term187660, 120, term190089);
        setElement(term187660, 121, term190089);
        setElement(term187660, 122, term190089);
        setElement(term187660, 123, term190089);
        setElement(term187660, 124, term190089);
        setElement(term187660, 125, term190089);
        setElement(term187660, 126, term190089);
        setElement(term187660, 127, term190089);
        setElement(term187660, 128, term190089);
        setElement(term187660, 129, term190089);
        setElement(term187660, 130, term190089);
        setElement(term187660, 131, term190089);
        setElement(term187660, 132, term190089);
        setElement(term187660, 133, term190089);
        setElement(term187660, 134, term190089);
        setElement(term187660, 135, term190089);
        setElement(term187660, 136, term190089);
        setElement(term187660, 137, term190089);
        setElement(term187660, 138, term190089);
        setElement(term187660, 139, term190089);
        setElement(term187660, 140, term190089);
        setElement(term187660, 141, term190089);
        setElement(term187660, 142, term190089);
        setElement(term187660, 143, term190089);
        setElement(term187660, 144, term190089);
        setElement(term187660, 145, term190089);
        setElement(term187660, 146, term190089);
        setElement(term187660, 147, term190089);
        setElement(term187660, 148, term190089);
        setElement(term187660, 149, term190089);
        setElement(term187660, 150, term190089);
        setElement(term187660, 151, term190089);
        setElement(term187660, 152, term190089);
        setElement(term187660, 153, term190089);
        setElement(term187660, 154, term190089);
        setElement(term187660, 155, term190089);
        setElement(term187660, 156, term190089);
        setElement(term187660, 157, term190089);
        setElement(term187660, 158, term190089);
        setElement(term187660, 159, term190089);
        setElement(term187660, 160, term190089);
        setElement(term187660, 161, term190089);
        setElement(term187660, 162, term190089);
        setElement(term187660, 163, term190089);
        setElement(term187660, 164, term190089);
        setElement(term187660, 165, term190089);
        setElement(term187660, 166, term190089);
        setElement(term187660, 167, term190089);
        setElement(term187660, 168, term190089);
        setElement(term187660, 169, term190089);
        setElement(term187660, 170, term190089);
        setElement(term187660, 171, term190089);
        setElement(term187660, 172, term190089);
        setElement(term187660, 173, term190089);
        setElement(term187660, 174, term190089);
        setElement(term187660, 175, term190089);
        setElement(term187660, 176, term190089);
        setElement(term187660, 177, term190089);
        setElement(term187660, 178, term190089);
        setElement(term187660, 179, term190089);
        setElement(term187660, 180, term190089);
        setElement(term187660, 181, term190089);
        setElement(term187660, 182, term190089);
        setElement(term187660, 183, term190089);
        setElement(term187660, 184, term190089);
        setElement(term187660, 185, term190089);
        setElement(term187660, 186, term190089);
        setElement(term187660, 187, term190089);
        setElement(term187660, 188, term190089);
        setElement(term187660, 189, term190089);
        setElement(term187660, 190, term190089);
        setElement(term187660, 191, term190089);
        setElement(term187660, 192, term190089);
        setElement(term187660, 193, term190089);
        setElement(term187660, 194, term190089);
        setElement(term187660, 195, term190089);
        setElement(term187660, 196, term190089);
        setElement(term187660, 197, term190089);
        setElement(term187660, 198, term190089);
        setElement(term187660, 199, term190089);
        setElement(term187660, 200, term190089);
        setElement(term187660, 201, term190089);
        setElement(term187660, 202, term190089);
        setElement(term187660, 203, term190089);
        setElement(term187660, 204, term190089);
        setElement(term187660, 205, term190089);
        setElement(term187660, 206, term190089);
        term190201 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        setField(term190201, term190201.getClass(), "val$prefix", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term187660;
        args[1] = term190201;
        try {
            callMethod(klass, "rename", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


