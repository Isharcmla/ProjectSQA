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

public class Tag_hashCode_90127135159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3824;
     Object term4309;

    public Tag_hashCode_90127135159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3824 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3824, term3824.getClass(), "tagName", "");
        setBooleanField(term3824, term3824.getClass(), "isBlock", false);
        term4309 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4309, term4309.getClass(), "tagName", "");
        setBooleanField(term4309, term4309.getClass(), "isBlock", false);
        setBooleanField(term4309, term4309.getClass(), "formatAsBlock", false);
        setBooleanField(term4309, term4309.getClass(), "canContainBlock", false);
        setBooleanField(term4309, term4309.getClass(), "canContainInline", false);
        setBooleanField(term4309, term4309.getClass(), "empty", false);
        setBooleanField(term4309, term4309.getClass(), "selfClosing", false);
        setBooleanField(term4309, term4309.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term3824, args);
        assertTrue(recursiveEquals(term3824, term4309));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


