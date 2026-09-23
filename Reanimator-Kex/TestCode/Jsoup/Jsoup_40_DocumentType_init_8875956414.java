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
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedHashMap;

public class DocumentType_init_8875956414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1072;

    public DocumentType_init_8875956414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1073 = new ArrayList();
        LinkedHashMap term1076 = new LinkedHashMap();
        term1072 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        Object term1075 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1072, term1072.getClass(), "parentNode", null);
        setField(term1072, term1072.getClass(), "childNodes", term1073);
        setField(term1075, term1075.getClass(), "attributes", term1076);
        setField(term1072, term1072.getClass(), "attributes", term1075);
        setField(term1072, term1072.getClass(), "baseUri", "xxtlPwDYFs");
        setIntField(term1072, term1072.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.DocumentType");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = "PAEBtnZtTD";
        args[1] = "sjlJAEtRrb";
        args[2] = "MuLcgQHgqz";
        args[3] = "xxtlPwDYFs";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1072));
    }

};


