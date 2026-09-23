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

public class Element_html_923814631107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55603;

    public Element_html_923814631107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term55629 = new ArrayList();
        term55603 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term55604 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term55625 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term55626 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term55627 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term55633 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term55635 = (Object[]) newArray("java.lang.String", 0);
        Object[] term55636 = (Object[]) newArray("java.lang.String", 0);
        setField(term55604, term55604.getClass(), "tagName", "sNQFlATEeQ");
        setBooleanField(term55604, term55604.getClass(), "isBlock", false);
        setBooleanField(term55604, term55604.getClass(), "formatAsBlock", false);
        setBooleanField(term55604, term55604.getClass(), "canContainInline", true);
        setBooleanField(term55604, term55604.getClass(), "empty", true);
        setBooleanField(term55604, term55604.getClass(), "selfClosing", false);
        setBooleanField(term55604, term55604.getClass(), "preserveWhitespace", true);
        setBooleanField(term55604, term55604.getClass(), "formList", false);
        setBooleanField(term55604, term55604.getClass(), "formSubmit", false);
        setField(term55603, term55603.getClass(), "tag", term55604);
        setField(term55625, term55625.getClass(), "referent", null);
        setField(term55626, term55626.getClass(), "lock", term55627);
        setField(term55626, term55626.getClass(), "head", null);
        setLongField(term55626, term55626.getClass(), "queueLength", -5216789073301458893L);
        setField(term55625, term55625.getClass(), "queue", term55626);
        setField(term55625, term55625.getClass(), "next", null);
        setField(term55625, term55625.getClass(), "discovered", null);
        setField(term55603, term55603.getClass(), "shadowChildrenRef", term55625);
        setField(term55603, term55603.getClass(), "childNodes", term55629);
        setIntField(term55633, term55633.getClass(), "size", -648200466);
        setField(term55633, term55633.getClass(), "keys", term55635);
        setField(term55633, term55633.getClass(), "vals", term55636);
        setField(term55603, term55603.getClass(), "attributes", term55633);
        setField(term55603, term55603.getClass(), "baseUri", "ZKMLioamsY");
        setField(term55603, term55603.getClass(), "parentNode", null);
        setIntField(term55603, term55603.getClass(), "siblingIndex", 2007134147);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WVbxuoDBcn";
        callMethod(klass, "html", argTypes, term55603, args);
    }

};


