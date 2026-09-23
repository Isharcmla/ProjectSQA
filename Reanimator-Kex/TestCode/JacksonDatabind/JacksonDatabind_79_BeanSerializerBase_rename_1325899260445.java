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

public class BeanSerializerBase_rename_1325899260445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240106;
     Object term244905;

    public BeanSerializerBase_rename_1325899260445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240106 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 267);
        Object term244545 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term244643 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object[] term243236 = (Object[]) newArray("java.lang.Class", 0);
        Object term244793 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        setField(term244643, term244643.getClass(), "_value", "");
        setField(term244545, term244545.getClass(), "_name", term244643);
        setField(term244545, term244545.getClass(), "_metadata", null);
        setField(term244545, term244545.getClass(), "_format", null);
        setField(term244545, term244545.getClass(), "_wrapperName", null);
        setField(term244545, term244545.getClass(), "_contextAnnotations", null);
        setField(term244545, term244545.getClass(), "_declaredType", null);
        setField(term244545, term244545.getClass(), "_member", null);
        setField(term244545, term244545.getClass(), "_accessorMethod", null);
        setField(term244545, term244545.getClass(), "_field", null);
        setField(term244545, term244545.getClass(), "_serializer", null);
        setField(term244545, term244545.getClass(), "_nullSerializer", null);
        setField(term244545, term244545.getClass(), "_internalSettings", null);
        setField(term244545, term244545.getClass(), "_cfgSerializationType", null);
        setField(term244545, term244545.getClass(), "_dynamicSerializers", null);
        setBooleanField(term244545, term244545.getClass(), "_suppressNulls", false);
        setField(term244545, term244545.getClass(), "_suppressableValue", null);
        setField(term244545, term244545.getClass(), "_includeInViews", term243236);
        setField(term244545, term244545.getClass(), "_typeSerializer", null);
        setField(term244545, term244545.getClass(), "_nonTrivialBaseType", null);
        setElement(term240106, 82, term244545);
        setElement(term240106, 221, term244793);
        setElement(term240106, 222, term244545);
        setElement(term240106, 223, term244545);
        setElement(term240106, 224, term244545);
        setElement(term240106, 225, term244545);
        setElement(term240106, 226, term244545);
        setElement(term240106, 227, term244545);
        setElement(term240106, 228, term244545);
        setElement(term240106, 229, term244545);
        setElement(term240106, 230, term244545);
        setElement(term240106, 231, term244545);
        setElement(term240106, 232, term244545);
        setElement(term240106, 233, term244545);
        setElement(term240106, 234, term244545);
        setElement(term240106, 235, term244545);
        setElement(term240106, 236, term244545);
        setElement(term240106, 237, term244545);
        setElement(term240106, 238, term244545);
        setElement(term240106, 239, term244545);
        setElement(term240106, 240, term244545);
        setElement(term240106, 241, term244545);
        setElement(term240106, 242, term244545);
        setElement(term240106, 243, term244545);
        setElement(term240106, 244, term244545);
        setElement(term240106, 245, term244545);
        setElement(term240106, 246, term244545);
        setElement(term240106, 247, term244545);
        setElement(term240106, 248, term244545);
        setElement(term240106, 249, term244545);
        setElement(term240106, 250, term244545);
        setElement(term240106, 251, term244545);
        setElement(term240106, 252, term244545);
        setElement(term240106, 253, term244545);
        setElement(term240106, 254, term244545);
        setElement(term240106, 255, term244545);
        setElement(term240106, 256, term244545);
        setElement(term240106, 257, term244545);
        setElement(term240106, 258, term244545);
        setElement(term240106, 259, term244545);
        setElement(term240106, 260, term244545);
        setElement(term240106, 261, term244545);
        setElement(term240106, 262, term244545);
        setElement(term240106, 263, term244545);
        setElement(term240106, 264, term244545);
        setElement(term240106, 265, term244545);
        setElement(term240106, 266, term244545);
        term244905 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        setField(term244905, term244905.getClass(), "val$prefix", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term240106;
        args[1] = term244905;
        try {
            callMethod(klass, "rename", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


