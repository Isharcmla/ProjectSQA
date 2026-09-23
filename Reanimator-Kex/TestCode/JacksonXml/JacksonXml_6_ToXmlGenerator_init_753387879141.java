package com.fasterxml.jackson.dataformat.xml.ser;

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
import static com.fasterxml.jackson.dataformat.xml.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.dataformat.xml.ser.EqualityUtils.*;
import java.lang.Object;
import java.util.LinkedList;

public class ToXmlGenerator_init_753387879141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25163;
     Object term25249;
     Object term25373;
     Object term25379;
     Object term25380;

    public ToXmlGenerator_init_753387879141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term24943 = newInstance(Class.forName("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        Object term25079 = newInstance(Class.forName("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter"));
        setIntField(term24943, term24943.getClass(), "_features", 0);
        setField(term24943, term24943.getClass(), "_objectCodec", null);
        setField(term24943, term24943.getClass(), "_writeContext", null);
        setBooleanField(term24943, term24943.getClass(), "_cfgNumbersAsStrings", false);
        setField(term24943, term24943.getClass(), "_nextName", null);
        setBooleanField(term24943, term24943.getClass(), "_nextIsAttribute", false);
        setBooleanField(term24943, term24943.getClass(), "_nextIsUnwrapped", false);
        setBooleanField(term24943, term24943.getClass(), "_nextIsCData", false);
        setField(term24943, term24943.getClass(), "_elementNameStack", null);
        setIntField(term24943, term24943.getClass(), "_formatFeatures", 0);
        setField(term24943, term24943.getClass(), "_ioContext", null);
        setField(term24943, term24943.getClass(), "_originalXmlWriter", null);
        setField(term24943, term24943.getClass(), "_xmlWriter", null);
        setBooleanField(term24943, term24943.getClass(), "_stax2Emulation", false);
        setField(term24943, term24943.getClass(), "_cfgPrettyPrinter", term25079);
        term25163 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        term25249 = newInstance(Class.forName("org.codehaus.stax2.ri.Stax2WriterAdapter"));
        LinkedList term25376 = new LinkedList();
        term25373 = newInstance(Class.forName("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        Object term25374 = newInstance(Class.forName("org.codehaus.stax2.ri.Stax2WriterAdapter"));
        Object term25375 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term25377 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        Object term25378 = newInstance(Class.forName("com.fasterxml.jackson.core.json.DupDetector"));
        setField(term25374, term25374.getClass(), "mEncoding", null);
        setField(term25374, term25374.getClass(), "mValueEncoder", null);
        setBooleanField(term25374, term25374.getClass(), "mNsRepairing", false);
        setField(term25374, term25374.getClass(), "mDelegate", null);
        setField(term25373, term25373.getClass(), "_xmlWriter", term25374);
        setField(term25373, term25373.getClass(), "_originalXmlWriter", term25374);
        setBooleanField(term25373, term25373.getClass(), "_stax2Emulation", false);
        setField(term25375, term25375.getClass(), "_sourceRef", null);
        setField(term25375, term25375.getClass(), "_encoding", null);
        setBooleanField(term25375, term25375.getClass(), "_managedResource", false);
        setField(term25375, term25375.getClass(), "_bufferRecycler", null);
        setField(term25375, term25375.getClass(), "_readIOBuffer", null);
        setField(term25375, term25375.getClass(), "_writeEncodingBuffer", null);
        setField(term25375, term25375.getClass(), "_base64Buffer", null);
        setField(term25375, term25375.getClass(), "_tokenCBuffer", null);
        setField(term25375, term25375.getClass(), "_concatCBuffer", null);
        setField(term25375, term25375.getClass(), "_nameCopyBuffer", null);
        setField(term25373, term25373.getClass(), "_ioContext", term25375);
        setIntField(term25373, term25373.getClass(), "_formatFeatures", 0);
        setField(term25373, term25373.getClass(), "_xmlPrettyPrinter", null);
        setBooleanField(term25373, term25373.getClass(), "_initialized", false);
        setField(term25373, term25373.getClass(), "_nextName", null);
        setBooleanField(term25373, term25373.getClass(), "_nextIsAttribute", false);
        setBooleanField(term25373, term25373.getClass(), "_nextIsUnwrapped", false);
        setBooleanField(term25373, term25373.getClass(), "_nextIsCData", false);
        setField(term25373, term25373.getClass(), "_elementNameStack", term25376);
        setField(term25373, term25373.getClass(), "_objectCodec", null);
        setIntField(term25373, term25373.getClass(), "_features", -1);
        setBooleanField(term25373, term25373.getClass(), "_cfgNumbersAsStrings", true);
        setField(term25377, term25377.getClass(), "_parent", null);
        setField(term25378, term25378.getClass(), "_source", term25373);
        setField(term25378, term25378.getClass(), "_firstName", null);
        setField(term25378, term25378.getClass(), "_secondName", null);
        setField(term25378, term25378.getClass(), "_seen", null);
        setField(term25377, term25377.getClass(), "_dups", term25378);
        setField(term25377, term25377.getClass(), "_child", null);
        setField(term25377, term25377.getClass(), "_currentName", null);
        setField(term25377, term25377.getClass(), "_currentValue", null);
        setBooleanField(term25377, term25377.getClass(), "_gotName", false);
        setIntField(term25377, term25377.getClass(), "_type", 0);
        setIntField(term25377, term25377.getClass(), "_index", -1);
        setField(term25373, term25373.getClass(), "_writeContext", term25377);
        setBooleanField(term25373, term25373.getClass(), "_closed", false);
        setField(term25373, term25373.getClass(), "_cfgPrettyPrinter", null);
        term25379 = newInstance(Class.forName("org.codehaus.stax2.ri.Stax2WriterAdapter"));
        setField(term25379, term25379.getClass(), "mEncoding", null);
        setField(term25379, term25379.getClass(), "mValueEncoder", null);
        setBooleanField(term25379, term25379.getClass(), "mNsRepairing", false);
        setField(term25379, term25379.getClass(), "mDelegate", null);
        term25380 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setField(term25380, term25380.getClass(), "_sourceRef", null);
        setField(term25380, term25380.getClass(), "_encoding", null);
        setBooleanField(term25380, term25380.getClass(), "_managedResource", false);
        setField(term25380, term25380.getClass(), "_bufferRecycler", null);
        setField(term25380, term25380.getClass(), "_readIOBuffer", null);
        setField(term25380, term25380.getClass(), "_writeEncodingBuffer", null);
        setField(term25380, term25380.getClass(), "_base64Buffer", null);
        setField(term25380, term25380.getClass(), "_tokenCBuffer", null);
        setField(term25380, term25380.getClass(), "_concatCBuffer", null);
        setField(term25380, term25380.getClass(), "_nameCopyBuffer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.io.IOContext");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        argTypes[4] = Class.forName("javax.xml.stream.XMLStreamWriter");
        Object[] args = new Object[5];
        args[0] = term25163;
        args[1] = -1;
        args[2] = 0;
        args[3] = null;
        args[4] = term25249;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term25373));
        assertTrue(recursiveEquals(term25163, -1));
        assertTrue(recursiveEquals(term25249, 0));
    }

};


