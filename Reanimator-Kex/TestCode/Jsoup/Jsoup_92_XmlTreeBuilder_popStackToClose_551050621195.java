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

public class XmlTreeBuilder_popStackToClose_551050621195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270573;
     Object term270869;

    public XmlTreeBuilder_popStackToClose_551050621195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term270751 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term270805 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term270691 = new ArrayList();
        ((ArrayList) term270691).add((Object)null);
        ((ArrayList) term270691).add((Object)null);
        ((ArrayList) term270691).add((Object)null);
        ((ArrayList) term270691).add((Object)null);
        ((ArrayList) term270691).add((Object)null);
        ((ArrayList) term270691).add((Object)null);
        ((ArrayList) term270691).add((Object)null);
        ((ArrayList) term270691).add((Object)null);
        ((ArrayList) term270691).add((Object)null);
        ((ArrayList) term270691).add((Object)null);
        ((ArrayList) term270691).add((Object)null);
        ((ArrayList) term270691).add((Object)null);
        ((ArrayList) term270691).add((Object)null);
        ((ArrayList) term270691).add((Object)null);
        ((ArrayList) term270691).add(term270751);
        ((ArrayList) term270691).add(term270805);
        term270573 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term270639 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term270639, term270639.getClass(), "preserveTagCase", false);
        setField(term270573, term270573.getClass(), "settings", term270639);
        setField(term270573, term270573.getClass(), "stack", term270691);
        term270869 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term270869, term270869.getClass(), "tagName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term270869;
        try {
            callMethod(klass, "popStackToClose", argTypes, term270573, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


