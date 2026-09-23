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
import java.lang.Object;

public class TokenQueue_matchesAny_212248099840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259;
     Object term273;
     Object term2537;
     Object term2540;

    public TokenQueue_matchesAny_212248099840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term259 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term259, term259.getClass(), "queue", "uuaPigETmJ");
        setIntField(term259, term259.getClass(), "pos", -2038273078);
        term273 = (Object[]) newArray("java.lang.String", 5);
        setElement(term273, 0, "MxlszYVzRf");
        setElement(term273, 1, "LQFpaHEwXR");
        setElement(term273, 2, "oVcInYnLWB");
        setElement(term273, 3, "aJlieCFVtF");
        setElement(term273, 4, "ZiaGIbnzTs");
        term2537 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term2537, term2537.getClass(), "queue", "uuaPigETmJ");
        setIntField(term2537, term2537.getClass(), "pos", -2038273078);
        term2540 = (Object[]) newArray("java.lang.String", 5);
        setElement(term2540, 0, "MxlszYVzRf");
        setElement(term2540, 1, "LQFpaHEwXR");
        setElement(term2540, 2, "oVcInYnLWB");
        setElement(term2540, 3, "aJlieCFVtF");
        setElement(term2540, 4, "ZiaGIbnzTs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokenQueue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term273;
        Object retValue = callMethod(klass, "matchesAny", argTypes, term259, args);
        assertTrue(recursiveEquals(term259, term2537));
        assertTrue(recursiveEquals(term273, term2540));
        assertTrue(recursiveEquals(retValue, false));
    }

};


