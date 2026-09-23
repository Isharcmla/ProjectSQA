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
import java.lang.Object;
import java.util.ArrayList;

public class Element_doClone_438653594107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9213;

    public Element_doClone_438653594107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9239 = new ArrayList();
        term9213 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9214 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9235 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term9236 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term9237 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term9243 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term9245 = (Object[]) newArray("java.lang.String", 0);
        Object[] term9246 = (Object[]) newArray("java.lang.String", 0);
        setField(term9214, term9214.getClass(), "tagName", "ZKMLioamsY");
        setBooleanField(term9214, term9214.getClass(), "isBlock", false);
        setBooleanField(term9214, term9214.getClass(), "formatAsBlock", false);
        setBooleanField(term9214, term9214.getClass(), "canContainInline", false);
        setBooleanField(term9214, term9214.getClass(), "empty", false);
        setBooleanField(term9214, term9214.getClass(), "selfClosing", false);
        setBooleanField(term9214, term9214.getClass(), "preserveWhitespace", true);
        setBooleanField(term9214, term9214.getClass(), "formList", true);
        setBooleanField(term9214, term9214.getClass(), "formSubmit", true);
        setField(term9213, term9213.getClass(), "tag", term9214);
        setField(term9235, term9235.getClass(), "referent", null);
        setField(term9236, term9236.getClass(), "lock", term9237);
        setField(term9236, term9236.getClass(), "head", null);
        setLongField(term9236, term9236.getClass(), "queueLength", -5216789073301458893L);
        setField(term9235, term9235.getClass(), "queue", term9236);
        setField(term9235, term9235.getClass(), "next", null);
        setField(term9235, term9235.getClass(), "discovered", null);
        setField(term9213, term9213.getClass(), "shadowChildrenRef", term9235);
        setField(term9213, term9213.getClass(), "childNodes", term9239);
        setIntField(term9243, term9243.getClass(), "size", 1236004505);
        setField(term9243, term9243.getClass(), "keys", term9245);
        setField(term9243, term9243.getClass(), "vals", term9246);
        setField(term9213, term9213.getClass(), "attributes", term9243);
        setField(term9213, term9213.getClass(), "baseUri", "WVbxuoDBcn");
        setField(term9213, term9213.getClass(), "parentNode", null);
        setIntField(term9213, term9213.getClass(), "siblingIndex", 1050765721);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "doClone", argTypes, term9213, args);
    }

};


