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

public class XmlTreeBuilder_popStackToClose_551050621131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237778;
     Object term238074;

    public XmlTreeBuilder_popStackToClose_551050621131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term237956 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term238010 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term237896 = new ArrayList();
        ((ArrayList) term237896).add((Object)null);
        ((ArrayList) term237896).add((Object)null);
        ((ArrayList) term237896).add((Object)null);
        ((ArrayList) term237896).add((Object)null);
        ((ArrayList) term237896).add((Object)null);
        ((ArrayList) term237896).add((Object)null);
        ((ArrayList) term237896).add((Object)null);
        ((ArrayList) term237896).add((Object)null);
        ((ArrayList) term237896).add((Object)null);
        ((ArrayList) term237896).add((Object)null);
        ((ArrayList) term237896).add((Object)null);
        ((ArrayList) term237896).add((Object)null);
        ((ArrayList) term237896).add((Object)null);
        ((ArrayList) term237896).add((Object)null);
        ((ArrayList) term237896).add(term237956);
        ((ArrayList) term237896).add(term238010);
        term237778 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term237844 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term237844, term237844.getClass(), "preserveTagCase", false);
        setField(term237778, term237778.getClass(), "settings", term237844);
        setField(term237778, term237778.getClass(), "stack", term237896);
        term238074 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term238074, term238074.getClass(), "tagName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term238074;
        try {
            callMethod(klass, "popStackToClose", argTypes, term237778, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


