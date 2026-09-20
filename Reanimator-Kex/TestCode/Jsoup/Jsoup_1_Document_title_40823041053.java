package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class Document_title_40823041053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31833;

    public Document_title_40823041053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term31969 = new ArrayList();
        ((ArrayList) term31969).add((Object)null);
        ((ArrayList) term31969).add((Object)null);
        ((ArrayList) term31969).add((Object)null);
        ((ArrayList) term31969).add((Object)null);
        ((ArrayList) term31969).add((Object)null);
        ((ArrayList) term31969).add((Object)null);
        ((ArrayList) term31969).add((Object)null);
        ((ArrayList) term31969).add((Object)null);
        ((ArrayList) term31969).add((Object)null);
        ((ArrayList) term31969).add((Object)null);
        ((ArrayList) term31969).add((Object)null);
        term31833 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term31879 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term31879, term31879.getClass(), "tagName", "                                         ");
        setField(term31833, term31833.getClass(), "tag", term31879);
        setField(term31833, term31833.getClass(), "childNodes", term31969);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "title", argTypes, term31833, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
