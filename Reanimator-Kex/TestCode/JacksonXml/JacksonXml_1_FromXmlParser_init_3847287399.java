package com.fasterxml.jackson.dataformat.xml.deser;

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
import static com.fasterxml.jackson.dataformat.xml.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class FromXmlParser_init_3847287399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15089;
     Object term15277;
     Object term15363;

    public FromXmlParser_init_3847287399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16338 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term16337 = ((Class) term16338).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term16337).setAccessible(true);
        Object enum1 = ((Field) term16337).get((Object) null);
        Object term14677 = newInstance(Class.forName("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        Object term14807 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term14927 = newInstance(Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setIntField(term14677, term14677.getClass(), "_features", 0);
        setField(term14677, term14677.getClass(), "_cfgNameForTextElement", "");
        setField(term14677, term14677.getClass(), "_byteArrayBuilder", null);
        setIntField(term14677, term14677.getClass(), "_formatFeatures", 0);
        setField(term14677, term14677.getClass(), "_ioContext", null);
        setField(term14677, term14677.getClass(), "_objectCodec", term14807);
        setField(term14677, term14677.getClass(), "_parsingContext", term14927);
        setField(term14677, term14677.getClass(), "_nextToken", enum1);
        term15089 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term15185 = newInstance(Class.forName("org.codehaus.stax2.util.StreamReader2Delegate"));
        setField(term15089, term15089.getClass(), "_sourceRef", term15185);
        term15277 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        term15363 = newInstance(Class.forName("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.io.IOContext");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        argTypes[4] = Class.forName("javax.xml.stream.XMLStreamReader");
        Object[] args = new Object[5];
        args[0] = term15089;
        args[1] = 0;
        args[2] = 0;
        args[3] = term15277;
        args[4] = term15363;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
