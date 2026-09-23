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

public class Parser_popStackToClose_1201258867119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79100;

    public Parser_popStackToClose_1201258867119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term79244 = newInstance(Class.forName("java.lang.Object"));
        Object term79282 = newInstance(Class.forName("java.lang.Object"));
        Object term79336 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term79359 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term79359, term79359.getClass(), "canContainBlock", false);
        setField(term79336, term79336.getClass(), "tag", term79359);
        LinkedList term79154 = new LinkedList();
        ((LinkedList) term79154).add(term79244);
        ((LinkedList) term79154).add(term79282);
        ((LinkedList) term79154).add((Object)null);
        ((LinkedList) term79154).add(term79336);
        term79100 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term79100, term79100.getClass(), "stack", term79154);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "popStackToClose", argTypes, term79100, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


