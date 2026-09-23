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
import java.util.ArrayList;

public class FormElement_formData_212170994244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23615;
     Object term24647;
     Object term24638;

    public FormElement_formData_212170994244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23615 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term23671 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term23615, term23615.getClass(), "elements", term23671);
        term24647 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term24648 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term24648, term24648.getClass(), "elementData", null);
        setIntField(term24648, term24648.getClass(), "size", 0);
        setIntField(term24648, term24648.getClass(), "modCount", 0);
        setField(term24647, term24647.getClass(), "elements", term24648);
        setField(term24647, term24647.getClass(), "tag", null);
        setField(term24647, term24647.getClass(), "parentNode", null);
        setField(term24647, term24647.getClass(), "childNodes", null);
        setField(term24647, term24647.getClass(), "attributes", null);
        setField(term24647, term24647.getClass(), "baseUri", null);
        setIntField(term24647, term24647.getClass(), "siblingIndex", 0);
        term24638 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "formData", argTypes, term23615, args);
        assertTrue(recursiveEquals(term23615, term24647));
        assertTrue(recursiveEquals(retValue, term24638));
    }

};


