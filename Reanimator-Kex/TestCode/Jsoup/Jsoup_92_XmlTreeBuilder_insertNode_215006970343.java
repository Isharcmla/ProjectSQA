package org.jsoup.parser;

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
import java.lang.UnsupportedOperationException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class XmlTreeBuilder_insertNode_215006970343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338039;
     Object term338203;

    public XmlTreeBuilder_insertNode_215006970343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term338151 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        ArrayList term338091 = new ArrayList();
        ((ArrayList) term338091).add((Object)null);
        ((ArrayList) term338091).add(term338151);
        term338039 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term338039, term338039.getClass(), "stack", term338091);
        term338203 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term338259 = newInstance(Class.forName("org.jsoup.nodes.CDataNode"));
        setField(term338203, term338203.getClass(), "parentNode", term338259);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term338203;
        try {
            callMethod(klass, "insertNode", argTypes, term338039, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


