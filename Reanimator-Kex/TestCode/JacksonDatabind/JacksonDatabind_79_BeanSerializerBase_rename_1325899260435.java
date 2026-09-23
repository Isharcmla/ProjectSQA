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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.ser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BeanSerializerBase_rename_1325899260435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227946;
     Object term229828;

    public BeanSerializerBase_rename_1325899260435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227946 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 206);
        Object term229368 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term229466 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term229604 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term229716 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        setField(term229466, term229466.getClass(), "_value", "");
        setField(term229368, term229368.getClass(), "_name", term229466);
        setField(term229368, term229368.getClass(), "_metadata", term229604);
        setField(term229368, term229368.getClass(), "_format", null);
        setField(term229368, term229368.getClass(), "_wrapperName", null);
        setField(term229368, term229368.getClass(), "_contextAnnotations", null);
        setField(term229368, term229368.getClass(), "_declaredType", null);
        setField(term229368, term229368.getClass(), "_member", null);
        setField(term229368, term229368.getClass(), "_accessorMethod", null);
        setField(term229368, term229368.getClass(), "_field", null);
        setField(term229368, term229368.getClass(), "_serializer", null);
        setField(term229368, term229368.getClass(), "_nullSerializer", null);
        setField(term229368, term229368.getClass(), "_internalSettings", null);
        setField(term229368, term229368.getClass(), "_cfgSerializationType", null);
        setField(term229368, term229368.getClass(), "_dynamicSerializers", null);
        setBooleanField(term229368, term229368.getClass(), "_suppressNulls", false);
        setField(term229368, term229368.getClass(), "_suppressableValue", null);
        setField(term229368, term229368.getClass(), "_includeInViews", null);
        setField(term229368, term229368.getClass(), "_typeSerializer", null);
        setField(term229368, term229368.getClass(), "_nonTrivialBaseType", null);
        setElement(term227946, 2, term229368);
        setElement(term227946, 110, term229716);
        setElement(term227946, 111, term229368);
        setElement(term227946, 112, term229368);
        setElement(term227946, 113, term229368);
        setElement(term227946, 114, term229368);
        setElement(term227946, 115, term229368);
        setElement(term227946, 116, term229368);
        setElement(term227946, 117, term229368);
        setElement(term227946, 118, term229368);
        setElement(term227946, 119, term229368);
        setElement(term227946, 120, term229368);
        setElement(term227946, 121, term229368);
        setElement(term227946, 122, term229368);
        setElement(term227946, 123, term229368);
        setElement(term227946, 124, term229368);
        setElement(term227946, 125, term229368);
        setElement(term227946, 126, term229368);
        setElement(term227946, 127, term229368);
        setElement(term227946, 128, term229368);
        setElement(term227946, 129, term229368);
        setElement(term227946, 130, term229368);
        setElement(term227946, 131, term229368);
        setElement(term227946, 132, term229368);
        setElement(term227946, 133, term229368);
        setElement(term227946, 134, term229368);
        setElement(term227946, 135, term229368);
        setElement(term227946, 136, term229368);
        setElement(term227946, 137, term229368);
        setElement(term227946, 138, term229368);
        setElement(term227946, 139, term229368);
        setElement(term227946, 140, term229368);
        setElement(term227946, 141, term229368);
        setElement(term227946, 142, term229368);
        setElement(term227946, 143, term229368);
        setElement(term227946, 144, term229368);
        setElement(term227946, 145, term229368);
        setElement(term227946, 146, term229368);
        setElement(term227946, 147, term229368);
        setElement(term227946, 148, term229368);
        setElement(term227946, 149, term229368);
        setElement(term227946, 150, term229368);
        setElement(term227946, 151, term229368);
        setElement(term227946, 152, term229368);
        setElement(term227946, 153, term229368);
        setElement(term227946, 154, term229368);
        setElement(term227946, 155, term229368);
        setElement(term227946, 156, term229368);
        setElement(term227946, 157, term229368);
        setElement(term227946, 158, term229368);
        setElement(term227946, 159, term229368);
        setElement(term227946, 160, term229368);
        setElement(term227946, 161, term229368);
        setElement(term227946, 162, term229368);
        setElement(term227946, 163, term229368);
        setElement(term227946, 164, term229368);
        setElement(term227946, 165, term229368);
        setElement(term227946, 166, term229368);
        setElement(term227946, 167, term229368);
        setElement(term227946, 168, term229368);
        setElement(term227946, 169, term229368);
        setElement(term227946, 170, term229368);
        setElement(term227946, 171, term229368);
        setElement(term227946, 172, term229368);
        setElement(term227946, 173, term229368);
        setElement(term227946, 174, term229368);
        setElement(term227946, 175, term229368);
        setElement(term227946, 176, term229368);
        setElement(term227946, 177, term229368);
        setElement(term227946, 178, term229368);
        setElement(term227946, 179, term229368);
        setElement(term227946, 180, term229368);
        setElement(term227946, 181, term229368);
        setElement(term227946, 182, term229368);
        setElement(term227946, 183, term229368);
        setElement(term227946, 184, term229368);
        setElement(term227946, 185, term229368);
        setElement(term227946, 186, term229368);
        setElement(term227946, 187, term229368);
        setElement(term227946, 188, term229368);
        setElement(term227946, 189, term229368);
        setElement(term227946, 190, term229368);
        setElement(term227946, 191, term229368);
        setElement(term227946, 192, term229368);
        setElement(term227946, 193, term229368);
        setElement(term227946, 194, term229368);
        setElement(term227946, 195, term229368);
        setElement(term227946, 196, term229368);
        setElement(term227946, 197, term229368);
        setElement(term227946, 198, term229368);
        setElement(term227946, 199, term229368);
        setElement(term227946, 200, term229368);
        setElement(term227946, 201, term229368);
        setElement(term227946, 202, term229368);
        setElement(term227946, 203, term229368);
        setElement(term227946, 204, term229368);
        setElement(term227946, 205, term229368);
        term229828 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$3"));
        setField(term229828, term229828.getClass(), "val$suffix", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term227946;
        args[1] = term229828;
        try {
            callMethod(klass, "rename", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


