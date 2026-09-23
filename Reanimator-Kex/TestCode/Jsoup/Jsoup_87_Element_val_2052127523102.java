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

public class Element_val_2052127523102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7890;

    public Element_val_2052127523102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7916 = new ArrayList();
        ((ArrayList) term7916).add((Object)null);
        ((ArrayList) term7916).add((Object)null);
        term7890 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7891 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7912 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term7913 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term7914 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term7920 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7922 = (Object[]) newArray("java.lang.String", 0);
        Object[] term7923 = (Object[]) newArray("java.lang.String", 0);
        setField(term7891, term7891.getClass(), "tagName", "vOuMEpOQAg");
        setBooleanField(term7891, term7891.getClass(), "isBlock", true);
        setBooleanField(term7891, term7891.getClass(), "formatAsBlock", false);
        setBooleanField(term7891, term7891.getClass(), "canContainInline", false);
        setBooleanField(term7891, term7891.getClass(), "empty", false);
        setBooleanField(term7891, term7891.getClass(), "selfClosing", false);
        setBooleanField(term7891, term7891.getClass(), "preserveWhitespace", false);
        setBooleanField(term7891, term7891.getClass(), "formList", false);
        setBooleanField(term7891, term7891.getClass(), "formSubmit", true);
        setField(term7890, term7890.getClass(), "tag", term7891);
        setField(term7912, term7912.getClass(), "referent", null);
        setField(term7913, term7913.getClass(), "lock", term7914);
        setField(term7913, term7913.getClass(), "head", null);
        setLongField(term7913, term7913.getClass(), "queueLength", 7247160664318067468L);
        setField(term7912, term7912.getClass(), "queue", term7913);
        setField(term7912, term7912.getClass(), "next", null);
        setField(term7912, term7912.getClass(), "discovered", null);
        setField(term7890, term7890.getClass(), "shadowChildrenRef", term7912);
        setField(term7890, term7890.getClass(), "childNodes", term7916);
        setIntField(term7920, term7920.getClass(), "size", -1835839814);
        setField(term7920, term7920.getClass(), "keys", term7922);
        setField(term7920, term7920.getClass(), "vals", term7923);
        setField(term7890, term7890.getClass(), "attributes", term7920);
        setField(term7890, term7890.getClass(), "baseUri", "SIODFGaQhr");
        setField(term7890, term7890.getClass(), "parentNode", null);
        setIntField(term7890, term7890.getClass(), "siblingIndex", -1404350380);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qYzsiuXOgS";
        callMethod(klass, "val", argTypes, term7890, args);
    }

};


