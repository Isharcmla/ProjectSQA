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

public class XmlTreeBuilder_insertNode_215006970445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377777;
     Object term377979;

    public XmlTreeBuilder_insertNode_215006970445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term377867 = newInstance(Class.forName("java.lang.Object"));
        Object term377927 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        ArrayList term377829 = new ArrayList();
        ((ArrayList) term377829).add(term377867);
        ((ArrayList) term377829).add(term377867);
        ((ArrayList) term377829).add(term377867);
        ((ArrayList) term377829).add(term377867);
        ((ArrayList) term377829).add(term377867);
        ((ArrayList) term377829).add(term377867);
        ((ArrayList) term377829).add(term377867);
        ((ArrayList) term377829).add(term377867);
        ((ArrayList) term377829).add(term377867);
        ((ArrayList) term377829).add(term377867);
        ((ArrayList) term377829).add(term377867);
        ((ArrayList) term377829).add(term377867);
        ((ArrayList) term377829).add(term377867);
        ((ArrayList) term377829).add(term377867);
        ((ArrayList) term377829).add(term377867);
        ((ArrayList) term377829).add(term377867);
        ((ArrayList) term377829).add(term377867);
        ((ArrayList) term377829).add(term377867);
        ((ArrayList) term377829).add(term377867);
        ((ArrayList) term377829).add(term377927);
        term377777 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term377777, term377777.getClass(), "stack", term377829);
        term377979 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term378031 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term378031, term378031.getClass(), "childNodes", null);
        setField(term377979, term377979.getClass(), "parentNode", term378031);
        setIntField(term377979, term377979.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term377979;
        try {
            callMethod(klass, "insertNode", argTypes, term377777, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


