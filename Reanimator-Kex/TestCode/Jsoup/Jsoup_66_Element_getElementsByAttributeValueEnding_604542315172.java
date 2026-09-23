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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class Element_getElementsByAttributeValueEnding_604542315172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4785;

    public Element_getElementsByAttributeValueEnding_604542315172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4811 = new ArrayList();
        term4785 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4786 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4807 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term4808 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term4809 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term4815 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term4817 = (Object[]) newArray("java.lang.String", 0);
        Object[] term4818 = (Object[]) newArray("java.lang.String", 0);
        setField(term4786, term4786.getClass(), "tagName", "PtirvZmsGt");
        setBooleanField(term4786, term4786.getClass(), "isBlock", true);
        setBooleanField(term4786, term4786.getClass(), "formatAsBlock", true);
        setBooleanField(term4786, term4786.getClass(), "canContainInline", false);
        setBooleanField(term4786, term4786.getClass(), "empty", false);
        setBooleanField(term4786, term4786.getClass(), "selfClosing", false);
        setBooleanField(term4786, term4786.getClass(), "preserveWhitespace", false);
        setBooleanField(term4786, term4786.getClass(), "formList", true);
        setBooleanField(term4786, term4786.getClass(), "formSubmit", false);
        setField(term4785, term4785.getClass(), "tag", term4786);
        setField(term4807, term4807.getClass(), "referent", null);
        setField(term4808, term4808.getClass(), "lock", term4809);
        setField(term4808, term4808.getClass(), "head", null);
        setLongField(term4808, term4808.getClass(), "queueLength", 2443640364875054177L);
        setField(term4807, term4807.getClass(), "queue", term4808);
        setField(term4807, term4807.getClass(), "next", null);
        setField(term4807, term4807.getClass(), "discovered", null);
        setField(term4785, term4785.getClass(), "shadowChildrenRef", term4807);
        setField(term4785, term4785.getClass(), "childNodes", term4811);
        setIntField(term4815, term4815.getClass(), "size", 480137250);
        setField(term4815, term4815.getClass(), "keys", term4817);
        setField(term4815, term4815.getClass(), "vals", term4818);
        setField(term4785, term4785.getClass(), "attributes", term4815);
        setField(term4785, term4785.getClass(), "baseUri", "HWkpTmtlrc");
        setField(term4785, term4785.getClass(), "parentNode", null);
        setIntField(term4785, term4785.getClass(), "siblingIndex", -341152642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "hMmaoREuCK";
        args[1] = "VeDtgDzGAN";
        try {
            callMethod(klass, "getElementsByAttributeValueEnding", argTypes, term4785, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


