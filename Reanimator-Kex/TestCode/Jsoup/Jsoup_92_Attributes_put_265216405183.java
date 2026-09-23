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

public class Attributes_put_265216405183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term584693;
     Object term584749;
     Object term584869;
     Object term584876;
     Object term584832;

    public Attributes_put_265216405183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term584693 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term584587 = (Object[]) newArray("java.lang.String", 0);
        Object[] term584590 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term584693, term584693.getClass(), "size", 0);
        setField(term584693, term584693.getClass(), "keys", term584587);
        setField(term584693, term584693.getClass(), "vals", term584590);
        term584749 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term584749, term584749.getClass(), "key", "");
        setField(term584749, term584749.getClass(), "val", "");
        term584869 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term584870 = (Object[]) newArray("java.lang.String", 4);
        Object[] term584873 = (Object[]) newArray("java.lang.String", 4);
        setIntField(term584869, term584869.getClass(), "size", 1);
        setElement(term584870, 0, "");
        setField(term584869, term584869.getClass(), "keys", term584870);
        setElement(term584873, 0, "");
        setField(term584869, term584869.getClass(), "vals", term584873);
        term584876 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term584881 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term584882 = (Object[]) newArray("java.lang.String", 4);
        Object[] term584885 = (Object[]) newArray("java.lang.String", 4);
        setField(term584876, term584876.getClass(), "key", "");
        setField(term584876, term584876.getClass(), "val", "");
        setIntField(term584881, term584881.getClass(), "size", 1);
        setElement(term584882, 0, "");
        setField(term584881, term584881.getClass(), "keys", term584882);
        setElement(term584885, 0, "");
        setField(term584881, term584881.getClass(), "vals", term584885);
        setField(term584876, term584876.getClass(), "parent", term584881);
        term584832 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term584834 = (Object[]) newArray("java.lang.String", 4);
        Object[] term584837 = (Object[]) newArray("java.lang.String", 4);
        setIntField(term584832, term584832.getClass(), "size", 1);
        setElement(term584834, 0, "");
        setField(term584832, term584832.getClass(), "keys", term584834);
        setElement(term584837, 0, "");
        setField(term584832, term584832.getClass(), "vals", term584837);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attribute");
        Object[] args = new Object[1];
        args[0] = term584749;
        Object retValue = callMethod(klass, "put", argTypes, term584693, args);
        assertTrue(recursiveEquals(term584693, term584869));
        assertTrue(recursiveEquals(term584749, term584876));
        assertTrue(recursiveEquals(retValue, term584832));
    }

};


