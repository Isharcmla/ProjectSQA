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

public class FormElement_formData_212170994249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65992;
     Object term66059;
     Object term66050;

    public FormElement_formData_212170994249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65992 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term66048 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term65992, term65992.getClass(), "elements", term66048);
        term66059 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term66060 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term66060, term66060.getClass(), "elementData", null);
        setIntField(term66060, term66060.getClass(), "size", 0);
        setIntField(term66060, term66060.getClass(), "modCount", 0);
        setField(term66059, term66059.getClass(), "elements", term66060);
        setField(term66059, term66059.getClass(), "tag", null);
        setField(term66059, term66059.getClass(), "shadowChildrenRef", null);
        setField(term66059, term66059.getClass(), "childNodes", null);
        setField(term66059, term66059.getClass(), "attributes", null);
        setField(term66059, term66059.getClass(), "baseUri", null);
        setField(term66059, term66059.getClass(), "parentNode", null);
        setIntField(term66059, term66059.getClass(), "siblingIndex", 0);
        term66050 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "formData", argTypes, term65992, args);
        assertTrue(recursiveEquals(term65992, term66059));
        assertTrue(recursiveEquals(retValue, term66050));
    }

};


