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

public class Tag_hashCode_901271351560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48228;
     Object term48439;

    public Tag_hashCode_901271351560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48228 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term48228, term48228.getClass(), "tagName", "");
        setBooleanField(term48228, term48228.getClass(), "isBlock", true);
        setBooleanField(term48228, term48228.getClass(), "formatAsBlock", true);
        setBooleanField(term48228, term48228.getClass(), "canContainInline", true);
        setBooleanField(term48228, term48228.getClass(), "empty", false);
        setBooleanField(term48228, term48228.getClass(), "selfClosing", true);
        setBooleanField(term48228, term48228.getClass(), "preserveWhitespace", false);
        setBooleanField(term48228, term48228.getClass(), "formList", false);
        setBooleanField(term48228, term48228.getClass(), "formSubmit", true);
        term48439 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term48439, term48439.getClass(), "tagName", "");
        setBooleanField(term48439, term48439.getClass(), "isBlock", true);
        setBooleanField(term48439, term48439.getClass(), "formatAsBlock", true);
        setBooleanField(term48439, term48439.getClass(), "canContainInline", true);
        setBooleanField(term48439, term48439.getClass(), "empty", false);
        setBooleanField(term48439, term48439.getClass(), "selfClosing", true);
        setBooleanField(term48439, term48439.getClass(), "preserveWhitespace", false);
        setBooleanField(term48439, term48439.getClass(), "formList", false);
        setBooleanField(term48439, term48439.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term48228, args);
        assertTrue(recursiveEquals(term48228, term48439));
        assertTrue(recursiveEquals(retValue, -1635994337));
    }

};


