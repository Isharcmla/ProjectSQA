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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class XmlTreeBuilder_insertNode_215006970171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254922;
     Object term255120;

    public XmlTreeBuilder_insertNode_215006970171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term255012 = newInstance(Class.forName("java.lang.Object"));
        Object term255064 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term255064, term255064.getClass(), "childNodes", null);
        ArrayList term254974 = new ArrayList();
        ((ArrayList) term254974).add(term255012);
        ((ArrayList) term254974).add(term255012);
        ((ArrayList) term254974).add(term255012);
        ((ArrayList) term254974).add(term255012);
        ((ArrayList) term254974).add(term255012);
        ((ArrayList) term254974).add(term255012);
        ((ArrayList) term254974).add(term255012);
        ((ArrayList) term254974).add(term255064);
        term254922 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term254922, term254922.getClass(), "stack", term254974);
        term255120 = newInstance(Class.forName("org.jsoup.nodes.CDataNode"));
        setField(term255120, term255120.getClass(), "parentNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term255120;
        try {
            callMethod(klass, "insertNode", argTypes, term254922, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


