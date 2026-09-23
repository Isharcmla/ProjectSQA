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

public class ToXmlGenerator_init_753387879135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19720;
     Object term22714;
     Object term22719;

    public ToXmlGenerator_init_753387879135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term19538 = new LinkedList();
        Object term19392 = newInstance(Class.forName("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        Object term19484 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term19624 = newInstance(Class.forName("org.codehaus.stax2.ri.Stax2WriterAdapter"));
        setIntField(term19392, term19392.getClass(), "_features", 0);
        setField(term19392, term19392.getClass(), "_objectCodec", term19484);
        setField(term19392, term19392.getClass(), "_writeContext", null);
        setBooleanField(term19392, term19392.getClass(), "_cfgNumbersAsStrings", false);
        setField(term19392, term19392.getClass(), "_nextName", null);
        setBooleanField(term19392, term19392.getClass(), "_nextIsAttribute", false);
        setBooleanField(term19392, term19392.getClass(), "_nextIsUnwrapped", false);
        setBooleanField(term19392, term19392.getClass(), "_nextIsCData", false);
        setField(term19392, term19392.getClass(), "_elementNameStack", term19538);
        setIntField(term19392, term19392.getClass(), "_formatFeatures", 0);
        setField(term19392, term19392.getClass(), "_ioContext", null);
        setField(term19392, term19392.getClass(), "_originalXmlWriter", term19624);
        term19720 = newInstance(Class.forName("org.codehaus.stax2.util.StreamWriter2Delegate"));
        LinkedList term22716 = new LinkedList();
        term22714 = newInstance(Class.forName("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        Object term22715 = newInstance(Class.forName("org.codehaus.stax2.util.StreamWriter2Delegate"));
        Object term22717 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        Object term22718 = newInstance(Class.forName("com.fasterxml.jackson.core.json.DupDetector"));
        setField(term22715, term22715.getClass(), "mDelegate2", null);
        setField(term22715, term22715.getClass(), "mDelegate", null);
        setField(term22714, term22714.getClass(), "_xmlWriter", term22715);
        setField(term22714, term22714.getClass(), "_originalXmlWriter", term22715);
        setBooleanField(term22714, term22714.getClass(), "_stax2Emulation", false);
        setField(term22714, term22714.getClass(), "_ioContext", null);
        setIntField(term22714, term22714.getClass(), "_formatFeatures", 0);
        setField(term22714, term22714.getClass(), "_xmlPrettyPrinter", null);
        setBooleanField(term22714, term22714.getClass(), "_initialized", false);
        setField(term22714, term22714.getClass(), "_nextName", null);
        setBooleanField(term22714, term22714.getClass(), "_nextIsAttribute", false);
        setBooleanField(term22714, term22714.getClass(), "_nextIsUnwrapped", false);
        setBooleanField(term22714, term22714.getClass(), "_nextIsCData", false);
        setField(term22714, term22714.getClass(), "_elementNameStack", term22716);
        setField(term22714, term22714.getClass(), "_objectCodec", null);
        setIntField(term22714, term22714.getClass(), "_features", -1);
        setBooleanField(term22714, term22714.getClass(), "_cfgNumbersAsStrings", true);
        setField(term22717, term22717.getClass(), "_parent", null);
        setField(term22718, term22718.getClass(), "_source", term22714);
        setField(term22718, term22718.getClass(), "_firstName", null);
        setField(term22718, term22718.getClass(), "_secondName", null);
        setField(term22718, term22718.getClass(), "_seen", null);
        setField(term22717, term22717.getClass(), "_dups", term22718);
        setField(term22717, term22717.getClass(), "_child", null);
        setField(term22717, term22717.getClass(), "_currentName", null);
        setField(term22717, term22717.getClass(), "_currentValue", null);
        setBooleanField(term22717, term22717.getClass(), "_gotName", false);
        setIntField(term22717, term22717.getClass(), "_type", 0);
        setIntField(term22717, term22717.getClass(), "_index", -1);
        setField(term22714, term22714.getClass(), "_writeContext", term22717);
        setBooleanField(term22714, term22714.getClass(), "_closed", false);
        setField(term22714, term22714.getClass(), "_cfgPrettyPrinter", null);
        term22719 = newInstance(Class.forName("org.codehaus.stax2.util.StreamWriter2Delegate"));
        setField(term22719, term22719.getClass(), "mDelegate2", null);
        setField(term22719, term22719.getClass(), "mDelegate", null);
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
        args[0] = null;
        args[1] = -1;
        args[2] = 0;
        args[3] = null;
        args[4] = term19720;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term22714));
        assertTrue(recursiveEquals(term19720, 0));
    }

};


