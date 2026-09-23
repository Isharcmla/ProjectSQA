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

public class Tag_hashCode_90127135191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6996;
     Object term7080;

    public Tag_hashCode_90127135191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6996 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term6996, term6996.getClass(), "tagName", "");
        setBooleanField(term6996, term6996.getClass(), "isBlock", true);
        setBooleanField(term6996, term6996.getClass(), "formatAsBlock", false);
        setBooleanField(term6996, term6996.getClass(), "canContainBlock", false);
        setBooleanField(term6996, term6996.getClass(), "canContainInline", true);
        term7080 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7080, term7080.getClass(), "tagName", "");
        setBooleanField(term7080, term7080.getClass(), "isBlock", true);
        setBooleanField(term7080, term7080.getClass(), "formatAsBlock", false);
        setBooleanField(term7080, term7080.getClass(), "canContainBlock", false);
        setBooleanField(term7080, term7080.getClass(), "canContainInline", true);
        setBooleanField(term7080, term7080.getClass(), "empty", false);
        setBooleanField(term7080, term7080.getClass(), "selfClosing", false);
        setBooleanField(term7080, term7080.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term6996, args);
        assertTrue(recursiveEquals(term6996, term7080));
        assertTrue(recursiveEquals(retValue, 887533472));
    }

};


