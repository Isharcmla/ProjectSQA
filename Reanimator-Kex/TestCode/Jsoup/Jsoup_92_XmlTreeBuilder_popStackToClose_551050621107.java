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

public class XmlTreeBuilder_popStackToClose_551050621107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223563;
     Object term223799;

    public XmlTreeBuilder_popStackToClose_551050621107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term223735 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term223681 = new ArrayList();
        ((ArrayList) term223681).add((Object)null);
        ((ArrayList) term223681).add((Object)null);
        ((ArrayList) term223681).add((Object)null);
        ((ArrayList) term223681).add((Object)null);
        ((ArrayList) term223681).add((Object)null);
        ((ArrayList) term223681).add((Object)null);
        ((ArrayList) term223681).add((Object)null);
        ((ArrayList) term223681).add((Object)null);
        ((ArrayList) term223681).add((Object)null);
        ((ArrayList) term223681).add((Object)null);
        ((ArrayList) term223681).add((Object)null);
        ((ArrayList) term223681).add(term223735);
        term223563 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term223629 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term223629, term223629.getClass(), "preserveTagCase", false);
        setField(term223563, term223563.getClass(), "settings", term223629);
        setField(term223563, term223563.getClass(), "stack", term223681);
        term223799 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term223799, term223799.getClass(), "tagName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term223799;
        try {
            callMethod(klass, "popStackToClose", argTypes, term223563, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


