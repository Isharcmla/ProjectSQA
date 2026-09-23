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
import java.lang.Object;
import java.util.ArrayList;

public class XmlTreeBuilder_popStackToClose_551050621407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term364397;
     Object term364687;

    public XmlTreeBuilder_popStackToClose_551050621407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term364569 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term364623 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term364515 = new ArrayList();
        ((ArrayList) term364515).add((Object)null);
        ((ArrayList) term364515).add((Object)null);
        ((ArrayList) term364515).add((Object)null);
        ((ArrayList) term364515).add((Object)null);
        ((ArrayList) term364515).add((Object)null);
        ((ArrayList) term364515).add((Object)null);
        ((ArrayList) term364515).add((Object)null);
        ((ArrayList) term364515).add((Object)null);
        ((ArrayList) term364515).add((Object)null);
        ((ArrayList) term364515).add((Object)null);
        ((ArrayList) term364515).add((Object)null);
        ((ArrayList) term364515).add((Object)null);
        ((ArrayList) term364515).add((Object)null);
        ((ArrayList) term364515).add((Object)null);
        ((ArrayList) term364515).add((Object)null);
        ((ArrayList) term364515).add((Object)null);
        ((ArrayList) term364515).add((Object)null);
        ((ArrayList) term364515).add((Object)null);
        ((ArrayList) term364515).add((Object)null);
        ((ArrayList) term364515).add((Object)null);
        ((ArrayList) term364515).add((Object)null);
        ((ArrayList) term364515).add((Object)null);
        ((ArrayList) term364515).add((Object)null);
        ((ArrayList) term364515).add((Object)null);
        ((ArrayList) term364515).add((Object)null);
        ((ArrayList) term364515).add((Object)null);
        ((ArrayList) term364515).add((Object)null);
        ((ArrayList) term364515).add((Object)null);
        ((ArrayList) term364515).add((Object)null);
        ((ArrayList) term364515).add((Object)null);
        ((ArrayList) term364515).add(term364569);
        ((ArrayList) term364515).add(term364623);
        term364397 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term364463 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term364463, term364463.getClass(), "preserveTagCase", false);
        setField(term364397, term364397.getClass(), "settings", term364463);
        setField(term364397, term364397.getClass(), "stack", term364515);
        term364687 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term364687, term364687.getClass(), "tagName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term364687;
        try {
            callMethod(klass, "popStackToClose", argTypes, term364397, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


