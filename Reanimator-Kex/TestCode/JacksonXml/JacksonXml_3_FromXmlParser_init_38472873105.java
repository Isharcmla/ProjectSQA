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

public class FromXmlParser_init_38472873105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19708;
     Object term19800;
     Object term19900;

    public FromXmlParser_init_38472873105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20601 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term20600 = ((Class) term20601).getDeclaredField((String) "NOT_AVAILABLE");
        ((Field) term20600).setAccessible(true);
        Object enum3 = ((Field) term20600).get((Object) null);
        Object term19444 = newInstance(Class.forName("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        Object term19546 = newInstance(Class.forName("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        setIntField(term19444, term19444.getClass(), "_features", 0);
        setField(term19444, term19444.getClass(), "_cfgNameForTextElement", null);
        setField(term19444, term19444.getClass(), "_byteArrayBuilder", term19546);
        setIntField(term19444, term19444.getClass(), "_formatFeatures", 0);
        setField(term19444, term19444.getClass(), "_ioContext", null);
        setField(term19444, term19444.getClass(), "_objectCodec", null);
        setField(term19444, term19444.getClass(), "_parsingContext", null);
        setField(term19444, term19444.getClass(), "_nextToken", enum3);
        term19708 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setField(term19708, term19708.getClass(), "_sourceRef", null);
        term19800 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term19900 = newInstance(Class.forName("org.codehaus.stax2.ri.Stax2FilteredStreamReader"));
        Object term20000 = newInstance(Class.forName("org.codehaus.stax2.ri.Stax2FilteredStreamReader"));
        setField(term19900, term19900.getClass(), "reader", term20000);
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
        args[0] = term19708;
        args[1] = 0;
        args[2] = 0;
        args[3] = term19800;
        args[4] = term19900;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


