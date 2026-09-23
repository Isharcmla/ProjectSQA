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

public class XmlTreeBuilder_insertNode_215006970291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term329545;
     Object term329745;

    public XmlTreeBuilder_insertNode_215006970291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term329635 = newInstance(Class.forName("java.lang.Object"));
        Object term329689 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term329597 = new ArrayList();
        ((ArrayList) term329597).add(term329635);
        ((ArrayList) term329597).add(term329635);
        ((ArrayList) term329597).add(term329635);
        ((ArrayList) term329597).add(term329635);
        ((ArrayList) term329597).add(term329635);
        ((ArrayList) term329597).add(term329635);
        ((ArrayList) term329597).add(term329635);
        ((ArrayList) term329597).add(term329635);
        ((ArrayList) term329597).add(term329635);
        ((ArrayList) term329597).add(term329635);
        ((ArrayList) term329597).add(term329635);
        ((ArrayList) term329597).add(term329635);
        ((ArrayList) term329597).add(term329635);
        ((ArrayList) term329597).add(term329635);
        ((ArrayList) term329597).add(term329635);
        ((ArrayList) term329597).add(term329635);
        ((ArrayList) term329597).add(term329635);
        ((ArrayList) term329597).add(term329635);
        ((ArrayList) term329597).add(term329635);
        ((ArrayList) term329597).add(term329689);
        term329545 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term329545, term329545.getClass(), "stack", term329597);
        term329745 = newInstance(Class.forName("org.jsoup.nodes.CDataNode"));
        Object term329799 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term329799, term329799.getClass(), "childNodes", null);
        setField(term329745, term329745.getClass(), "parentNode", term329799);
        setIntField(term329745, term329745.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term329745;
        try {
            callMethod(klass, "insertNode", argTypes, term329545, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


