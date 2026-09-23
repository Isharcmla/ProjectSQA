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

public class Attribute_setValue_30786058725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262;
     Object term54037;

    public Attribute_setValue_30786058725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term262 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term287 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term289 = (Object[]) newArray("java.lang.String", 0);
        Object[] term290 = (Object[]) newArray("java.lang.String", 0);
        setField(term262, term262.getClass(), "key", "uuaPigETmJ");
        setField(term262, term262.getClass(), "val", "MxlszYVzRf");
        setIntField(term287, term287.getClass(), "size", -1922583790);
        setField(term287, term287.getClass(), "keys", term289);
        setField(term287, term287.getClass(), "vals", term290);
        setField(term262, term262.getClass(), "parent", term287);
        term54037 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term54042 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term54043 = (Object[]) newArray("java.lang.String", 0);
        Object[] term54044 = (Object[]) newArray("java.lang.String", 0);
        setField(term54037, term54037.getClass(), "key", "uuaPigETmJ");
        setField(term54037, term54037.getClass(), "val", "LQFpaHEwXR");
        setIntField(term54042, term54042.getClass(), "size", -1922583790);
        setField(term54042, term54042.getClass(), "keys", term54043);
        setField(term54042, term54042.getClass(), "vals", term54044);
        setField(term54037, term54037.getClass(), "parent", term54042);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LQFpaHEwXR";
        Object retValue = callMethod(klass, "setValue", argTypes, term262, args);
        assertTrue(recursiveEquals(term262, term54037));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


