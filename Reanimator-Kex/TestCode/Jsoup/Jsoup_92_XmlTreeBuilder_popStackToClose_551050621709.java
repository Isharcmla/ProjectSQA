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

public class XmlTreeBuilder_popStackToClose_551050621709 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term561378;
     Object term561774;

    public XmlTreeBuilder_popStackToClose_551050621709() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term561556 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term561602 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term561556, term561556.getClass(), "tag", term561602);
        Object term561656 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term561710 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term561496 = new ArrayList();
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add((Object)null);
        ((ArrayList) term561496).add(term561556);
        ((ArrayList) term561496).add(term561656);
        ((ArrayList) term561496).add(term561710);
        term561378 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term561444 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term561444, term561444.getClass(), "preserveTagCase", false);
        setField(term561378, term561378.getClass(), "settings", term561444);
        setField(term561378, term561378.getClass(), "stack", term561496);
        term561774 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term561774, term561774.getClass(), "tagName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term561774;
        try {
            callMethod(klass, "popStackToClose", argTypes, term561378, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


