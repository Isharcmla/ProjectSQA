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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class Tag_register_3436246361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10254;
     Object term10331;
     Object term10302;

    public Tag_register_3436246361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10254 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10254, term10254.getClass(), "ancestors", null);
        ArrayList term10336 = new ArrayList();
        ((ArrayList) term10336).add((Object)null);
        Object term10334 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10334, term10334.getClass(), "tagName", "");
        setBooleanField(term10334, term10334.getClass(), "isBlock", true);
        setBooleanField(term10334, term10334.getClass(), "canContainBlock", true);
        setBooleanField(term10334, term10334.getClass(), "canContainInline", true);
        setBooleanField(term10334, term10334.getClass(), "optionalClosing", false);
        setBooleanField(term10334, term10334.getClass(), "empty", false);
        setBooleanField(term10334, term10334.getClass(), "preserveWhitespace", false);
        setField(term10334, term10334.getClass(), "ancestors", term10336);
        ArrayList term10332 = new ArrayList();
        ((ArrayList) term10332).add(term10334);
        term10331 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10331, term10331.getClass(), "tagName", null);
        setBooleanField(term10331, term10331.getClass(), "isBlock", false);
        setBooleanField(term10331, term10331.getClass(), "canContainBlock", false);
        setBooleanField(term10331, term10331.getClass(), "canContainInline", false);
        setBooleanField(term10331, term10331.getClass(), "optionalClosing", false);
        setBooleanField(term10331, term10331.getClass(), "empty", false);
        setBooleanField(term10331, term10331.getClass(), "preserveWhitespace", false);
        setField(term10331, term10331.getClass(), "ancestors", term10332);
        ArrayList term10319 = new ArrayList();
        ((ArrayList) term10319).add((Object)null);
        Object term10311 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10311, term10311.getClass(), "tagName", "");
        setBooleanField(term10311, term10311.getClass(), "isBlock", true);
        setBooleanField(term10311, term10311.getClass(), "canContainBlock", true);
        setBooleanField(term10311, term10311.getClass(), "canContainInline", true);
        setBooleanField(term10311, term10311.getClass(), "optionalClosing", false);
        setBooleanField(term10311, term10311.getClass(), "empty", false);
        setBooleanField(term10311, term10311.getClass(), "preserveWhitespace", false);
        setField(term10311, term10311.getClass(), "ancestors", term10319);
        ArrayList term10309 = new ArrayList();
        ((ArrayList) term10309).add(term10311);
        term10302 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10302, term10302.getClass(), "tagName", null);
        setBooleanField(term10302, term10302.getClass(), "isBlock", false);
        setBooleanField(term10302, term10302.getClass(), "canContainBlock", false);
        setBooleanField(term10302, term10302.getClass(), "canContainInline", false);
        setBooleanField(term10302, term10302.getClass(), "optionalClosing", false);
        setBooleanField(term10302, term10302.getClass(), "empty", false);
        setBooleanField(term10302, term10302.getClass(), "preserveWhitespace", false);
        setField(term10302, term10302.getClass(), "ancestors", term10309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term10254;
        Object retValue = callMethod(klass, "register", argTypes, null, args);
        assertTrue(recursiveEquals(term10254, term10331));
        assertTrue(recursiveEquals(retValue, term10302));
    }

};


