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

public class Element_attr_298745360123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term981;

    public Element_attr_298745360123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1007 = new ArrayList();
        ((ArrayList) term1007).add((Object)null);
        ((ArrayList) term1007).add((Object)null);
        ((ArrayList) term1007).add((Object)null);
        ((ArrayList) term1007).add((Object)null);
        ((ArrayList) term1007).add((Object)null);
        term981 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term982 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1003 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term1004 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term1005 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term1011 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term1013 = (Object[]) newArray("java.lang.String", 0);
        Object[] term1014 = (Object[]) newArray("java.lang.String", 0);
        setField(term982, term982.getClass(), "tagName", "dWRymuLBtr");
        setBooleanField(term982, term982.getClass(), "isBlock", false);
        setBooleanField(term982, term982.getClass(), "formatAsBlock", true);
        setBooleanField(term982, term982.getClass(), "canContainInline", true);
        setBooleanField(term982, term982.getClass(), "empty", false);
        setBooleanField(term982, term982.getClass(), "selfClosing", false);
        setBooleanField(term982, term982.getClass(), "preserveWhitespace", false);
        setBooleanField(term982, term982.getClass(), "formList", false);
        setBooleanField(term982, term982.getClass(), "formSubmit", false);
        setField(term981, term981.getClass(), "tag", term982);
        setField(term1003, term1003.getClass(), "referent", null);
        setField(term1004, term1004.getClass(), "lock", term1005);
        setField(term1004, term1004.getClass(), "head", null);
        setLongField(term1004, term1004.getClass(), "queueLength", -4325723315152823407L);
        setField(term1003, term1003.getClass(), "queue", term1004);
        setField(term1003, term1003.getClass(), "next", null);
        setField(term1003, term1003.getClass(), "discovered", null);
        setField(term981, term981.getClass(), "shadowChildrenRef", term1003);
        setField(term981, term981.getClass(), "childNodes", term1007);
        setIntField(term1011, term1011.getClass(), "size", 1135664017);
        setField(term1011, term1011.getClass(), "keys", term1013);
        setField(term1011, term1011.getClass(), "vals", term1014);
        setField(term981, term981.getClass(), "attributes", term1011);
        setField(term981, term981.getClass(), "baseUri", "AijpHYOFuy");
        setField(term981, term981.getClass(), "parentNode", null);
        setIntField(term981, term981.getClass(), "siblingIndex", 590364439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "SbAoxhfrkn";
        args[1] = "kuTXqwMtDB";
        try {
            callMethod(klass, "attr", argTypes, term981, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


