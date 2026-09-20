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
import java.lang.ClassCastException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class Document_title_40823041082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53817;

    public Document_title_40823041082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term54007 = newInstance(Class.forName("org.jsoup.nodes.DataNode"));
        Object term54045 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term53953 = new ArrayList();
        ((ArrayList) term53953).add(term54007);
        ((ArrayList) term53953).add(term54045);
        ((ArrayList) term53953).add((Object)null);
        ((ArrayList) term53953).add((Object)null);
        ((ArrayList) term53953).add((Object)null);
        ((ArrayList) term53953).add((Object)null);
        ((ArrayList) term53953).add((Object)null);
        ((ArrayList) term53953).add((Object)null);
        ((ArrayList) term53953).add((Object)null);
        ((ArrayList) term53953).add((Object)null);
        term53817 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term53863 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term53863, term53863.getClass(), "tagName", "                 ");
        setField(term53817, term53817.getClass(), "tag", term53863);
        setField(term53817, term53817.getClass(), "childNodes", term53953);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "title", argTypes, term53817, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};
