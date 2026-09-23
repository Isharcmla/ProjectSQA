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
import static com.fasterxml.jackson.databind.ser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.ser.std.EqualityUtils.*;
import java.lang.Object;

public class BeanSerializerBase_rename_1325899260379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169226;
     Object term170436;
     Object term171312;
     Object term171313;
     Object term171293;

    public BeanSerializerBase_rename_1325899260379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169226 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 85);
        Object term170084 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term170182 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term170324 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        Object[] term169348 = (Object[]) newArray("java.lang.Class", 0);
        setField(term170182, term170182.getClass(), "_value", "");
        setField(term170084, term170084.getClass(), "_name", term170182);
        setField(term170084, term170084.getClass(), "_metadata", null);
        setField(term170084, term170084.getClass(), "_format", term170324);
        setField(term170084, term170084.getClass(), "_wrapperName", null);
        setField(term170084, term170084.getClass(), "_contextAnnotations", null);
        setField(term170084, term170084.getClass(), "_declaredType", null);
        setField(term170084, term170084.getClass(), "_member", null);
        setField(term170084, term170084.getClass(), "_accessorMethod", null);
        setField(term170084, term170084.getClass(), "_field", null);
        setField(term170084, term170084.getClass(), "_serializer", null);
        setField(term170084, term170084.getClass(), "_nullSerializer", null);
        setField(term170084, term170084.getClass(), "_internalSettings", null);
        setField(term170084, term170084.getClass(), "_cfgSerializationType", null);
        setField(term170084, term170084.getClass(), "_dynamicSerializers", null);
        setBooleanField(term170084, term170084.getClass(), "_suppressNulls", false);
        setField(term170084, term170084.getClass(), "_suppressableValue", null);
        setField(term170084, term170084.getClass(), "_includeInViews", term169348);
        setField(term170084, term170084.getClass(), "_typeSerializer", null);
        setField(term170084, term170084.getClass(), "_nonTrivialBaseType", null);
        setElement(term169226, 58, term170084);
        term170436 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        setField(term170436, term170436.getClass(), "val$prefix", null);
        term171312 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        setField(term171312, term171312.getClass(), "val$prefix", null);
        term171313 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 85);
        Object term171314 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term171315 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object[] term171318 = (Object[]) newArray("java.lang.Class", 0);
        Object term171319 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(term171315, term171315.getClass(), "_value", "");
        setField(term171315, term171315.getClass(), "_quotedUTF8Ref", null);
        setField(term171315, term171315.getClass(), "_unquotedUTF8Ref", null);
        setField(term171315, term171315.getClass(), "_quotedChars", null);
        setField(term171315, term171315.getClass(), "_jdkSerializeValue", null);
        setField(term171314, term171314.getClass(), "_name", term171315);
        setField(term171314, term171314.getClass(), "_wrapperName", null);
        setField(term171314, term171314.getClass(), "_declaredType", null);
        setField(term171314, term171314.getClass(), "_cfgSerializationType", null);
        setField(term171314, term171314.getClass(), "_nonTrivialBaseType", null);
        setField(term171314, term171314.getClass(), "_contextAnnotations", null);
        setField(term171314, term171314.getClass(), "_member", null);
        setField(term171314, term171314.getClass(), "_accessorMethod", null);
        setField(term171314, term171314.getClass(), "_field", null);
        setField(term171314, term171314.getClass(), "_serializer", null);
        setField(term171314, term171314.getClass(), "_nullSerializer", null);
        setField(term171314, term171314.getClass(), "_typeSerializer", null);
        setField(term171314, term171314.getClass(), "_dynamicSerializers", null);
        setBooleanField(term171314, term171314.getClass(), "_suppressNulls", false);
        setField(term171314, term171314.getClass(), "_suppressableValue", null);
        setField(term171314, term171314.getClass(), "_includeInViews", term171318);
        setField(term171314, term171314.getClass(), "_internalSettings", null);
        setField(term171314, term171314.getClass(), "_metadata", null);
        setField(term171319, term171319.getClass(), "_pattern", null);
        setField(term171319, term171319.getClass(), "_shape", null);
        setField(term171319, term171319.getClass(), "_locale", null);
        setField(term171319, term171319.getClass(), "_timezoneStr", null);
        setField(term171319, term171319.getClass(), "_features", null);
        setField(term171319, term171319.getClass(), "_timezone", null);
        setField(term171314, term171314.getClass(), "_format", term171319);
        setElement(term171313, 58, term171314);
        term171293 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 85);
        Object term171294 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term171295 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object[] term171303 = (Object[]) newArray("java.lang.Class", 0);
        Object term171304 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        setField(term171295, term171295.getClass(), "_value", "null");
        setField(term171295, term171295.getClass(), "_quotedUTF8Ref", null);
        setField(term171295, term171295.getClass(), "_unquotedUTF8Ref", null);
        setField(term171295, term171295.getClass(), "_quotedChars", null);
        setField(term171295, term171295.getClass(), "_jdkSerializeValue", null);
        setField(term171294, term171294.getClass(), "_name", term171295);
        setField(term171294, term171294.getClass(), "_wrapperName", null);
        setField(term171294, term171294.getClass(), "_declaredType", null);
        setField(term171294, term171294.getClass(), "_cfgSerializationType", null);
        setField(term171294, term171294.getClass(), "_nonTrivialBaseType", null);
        setField(term171294, term171294.getClass(), "_contextAnnotations", null);
        setField(term171294, term171294.getClass(), "_member", null);
        setField(term171294, term171294.getClass(), "_accessorMethod", null);
        setField(term171294, term171294.getClass(), "_field", null);
        setField(term171294, term171294.getClass(), "_serializer", null);
        setField(term171294, term171294.getClass(), "_nullSerializer", null);
        setField(term171294, term171294.getClass(), "_typeSerializer", null);
        setField(term171294, term171294.getClass(), "_dynamicSerializers", null);
        setBooleanField(term171294, term171294.getClass(), "_suppressNulls", false);
        setField(term171294, term171294.getClass(), "_suppressableValue", null);
        setField(term171294, term171294.getClass(), "_includeInViews", term171303);
        setField(term171294, term171294.getClass(), "_internalSettings", null);
        setField(term171294, term171294.getClass(), "_metadata", null);
        setField(term171304, term171304.getClass(), "_pattern", null);
        setField(term171304, term171304.getClass(), "_shape", null);
        setField(term171304, term171304.getClass(), "_locale", null);
        setField(term171304, term171304.getClass(), "_timezoneStr", null);
        setField(term171304, term171304.getClass(), "_features", null);
        setField(term171304, term171304.getClass(), "_timezone", null);
        setField(term171294, term171294.getClass(), "_format", term171304);
        setElement(term171293, 58, term171294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term169226;
        args[1] = term170436;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term169226, term171312));
        assertTrue(recursiveEquals(term170436, term171313));
        assertTrue(recursiveEquals(retValue, term171293));
    }

};


