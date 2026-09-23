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

public class Attributes_put_265216405527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13898723;
     Object term13898855;
     Object term13899952;
     Object term13899961;
     Object term13899427;

    public Attributes_put_265216405527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13898723 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term13897979 = (Object[]) newArray("java.lang.String", 3);
        Object[] term13898477 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term13898723, term13898723.getClass(), "size", 2);
        setElement(term13897979, 1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setElement(term13897979, 2, "");
        setField(term13898723, term13898723.getClass(), "keys", term13897979);
        setField(term13898723, term13898723.getClass(), "vals", term13898477);
        term13898855 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term13898855, term13898855.getClass(), "key", "");
        setField(term13898855, term13898855.getClass(), "val", "");
        term13899952 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term13899953 = (Object[]) newArray("java.lang.String", 3);
        Object[] term13899958 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term13899952, term13899952.getClass(), "size", 3);
        setElement(term13899953, 1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setElement(term13899953, 2, "");
        setField(term13899952, term13899952.getClass(), "keys", term13899953);
        setElement(term13899958, 2, "");
        setField(term13899952, term13899952.getClass(), "vals", term13899958);
        term13899961 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term13899966 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term13899967 = (Object[]) newArray("java.lang.String", 3);
        Object[] term13899972 = (Object[]) newArray("java.lang.String", 489);
        setField(term13899961, term13899961.getClass(), "key", "");
        setField(term13899961, term13899961.getClass(), "val", "");
        setIntField(term13899966, term13899966.getClass(), "size", 3);
        setElement(term13899967, 1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setElement(term13899967, 2, "");
        setField(term13899966, term13899966.getClass(), "keys", term13899967);
        setElement(term13899972, 2, "");
        setField(term13899966, term13899966.getClass(), "vals", term13899972);
        setField(term13899961, term13899961.getClass(), "parent", term13899966);
        term13899427 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term13899429 = (Object[]) newArray("java.lang.String", 3);
        Object[] term13899923 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term13899427, term13899427.getClass(), "size", 3);
        setElement(term13899429, 1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setElement(term13899429, 2, "");
        setField(term13899427, term13899427.getClass(), "keys", term13899429);
        setElement(term13899923, 2, "");
        setField(term13899427, term13899427.getClass(), "vals", term13899923);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attribute");
        Object[] args = new Object[1];
        args[0] = term13898855;
        Object retValue = callMethod(klass, "put", argTypes, term13898723, args);
        assertTrue(recursiveEquals(term13898723, term13899952));
        assertTrue(recursiveEquals(term13898855, term13899961));
        assertTrue(recursiveEquals(retValue, term13899427));
    }

};


