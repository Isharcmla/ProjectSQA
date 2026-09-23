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
import java.util.LinkedList;
import java.lang.Object;

public class Parser_popStackToClose_1201258867111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60485;

    public Parser_popStackToClose_1201258867111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term60705 = newInstance(Class.forName("java.lang.Object"));
        Object term60743 = newInstance(Class.forName("java.lang.Object"));
        Object term60797 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term60851 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term60874 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term60874, term60874.getClass(), "canContainBlock", false);
        setField(term60851, term60851.getClass(), "tag", term60874);
        LinkedList term60539 = new LinkedList();
        ((LinkedList) term60539).add("java.lang.String");
        ((LinkedList) term60539).add("byte[]");
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add(term60705);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add(term60743);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add((Object)null);
        ((LinkedList) term60539).add(term60797);
        ((LinkedList) term60539).add(term60851);
        term60485 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term60485, term60485.getClass(), "stack", term60539);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "popStackToClose", argTypes, term60485, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


