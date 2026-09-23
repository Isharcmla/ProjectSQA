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

public class XmlTreeBuilder_popStackToClose_551050621203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273493;
     Object term273747;

    public XmlTreeBuilder_popStackToClose_551050621203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term273683 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        ArrayList term273611 = new ArrayList();
        ((ArrayList) term273611).add((Object)null);
        ((ArrayList) term273611).add((Object)null);
        ((ArrayList) term273611).add((Object)null);
        ((ArrayList) term273611).add((Object)null);
        ((ArrayList) term273611).add((Object)null);
        ((ArrayList) term273611).add((Object)null);
        ((ArrayList) term273611).add((Object)null);
        ((ArrayList) term273611).add(term273683);
        term273493 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term273559 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term273559, term273559.getClass(), "preserveTagCase", false);
        setField(term273493, term273493.getClass(), "settings", term273559);
        setField(term273493, term273493.getClass(), "stack", term273611);
        term273747 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term273747, term273747.getClass(), "tagName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term273747;
        try {
            callMethod(klass, "popStackToClose", argTypes, term273493, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


