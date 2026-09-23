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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;

public class Attributes_put_28062925376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6068038;
     Object term7765509;
     Object term7765432;

    public Attributes_put_28062925376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6068038 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6067683 = (Object[]) newArray("java.lang.String", 8);
        setIntField(term6068038, term6068038.getClass(), "size", 4);
        setElement(term6067683, 3, "        ");
        setElement(term6067683, 4, "        ");
        setElement(term6067683, 5, "        ");
        setElement(term6067683, 6, "        ");
        setElement(term6067683, 7, "        ");
        setField(term6068038, term6068038.getClass(), "keys", term6067683);
        term7765509 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7765510 = (Object[]) newArray("java.lang.String", 8);
        setIntField(term7765509, term7765509.getClass(), "size", 4);
        setElement(term7765510, 3, "        ");
        setElement(term7765510, 4, "        ");
        setElement(term7765510, 5, "        ");
        setElement(term7765510, 6, "        ");
        setElement(term7765510, 7, "        ");
        setField(term7765509, term7765509.getClass(), "keys", term7765510);
        setField(term7765509, term7765509.getClass(), "vals", null);
        term7765432 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7765434 = (Object[]) newArray("java.lang.String", 8);
        setIntField(term7765432, term7765432.getClass(), "size", 4);
        setElement(term7765434, 3, "        ");
        setElement(term7765434, 4, "        ");
        setElement(term7765434, 5, "        ");
        setElement(term7765434, 6, "        ");
        setElement(term7765434, 7, "        ");
        setField(term7765432, term7765432.getClass(), "keys", term7765434);
        setField(term7765432, term7765432.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = false;
        Object retValue = callMethod(klass, "put", argTypes, term6068038, args);
        assertTrue(recursiveEquals(term6068038, term7765509));
        assertTrue(recursiveEquals(retValue, term7765432));
    }

};


