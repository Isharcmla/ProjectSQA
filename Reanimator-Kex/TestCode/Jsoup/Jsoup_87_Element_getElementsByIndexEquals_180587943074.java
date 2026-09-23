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
import java.lang.Integer;

public class Element_getElementsByIndexEquals_180587943074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5697;
     Object term5744;

    public Element_getElementsByIndexEquals_180587943074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5723 = new ArrayList();
        ((ArrayList) term5723).add((Object)null);
        ((ArrayList) term5723).add((Object)null);
        ((ArrayList) term5723).add((Object)null);
        ((ArrayList) term5723).add((Object)null);
        ((ArrayList) term5723).add((Object)null);
        ((ArrayList) term5723).add((Object)null);
        ((ArrayList) term5723).add((Object)null);
        ((ArrayList) term5723).add((Object)null);
        term5697 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5698 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5719 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term5720 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term5721 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term5727 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5729 = (Object[]) newArray("java.lang.String", 0);
        Object[] term5730 = (Object[]) newArray("java.lang.String", 0);
        setField(term5698, term5698.getClass(), "tagName", "YpJbIgJWWv");
        setBooleanField(term5698, term5698.getClass(), "isBlock", false);
        setBooleanField(term5698, term5698.getClass(), "formatAsBlock", true);
        setBooleanField(term5698, term5698.getClass(), "canContainInline", true);
        setBooleanField(term5698, term5698.getClass(), "empty", false);
        setBooleanField(term5698, term5698.getClass(), "selfClosing", false);
        setBooleanField(term5698, term5698.getClass(), "preserveWhitespace", false);
        setBooleanField(term5698, term5698.getClass(), "formList", false);
        setBooleanField(term5698, term5698.getClass(), "formSubmit", false);
        setField(term5697, term5697.getClass(), "tag", term5698);
        setField(term5719, term5719.getClass(), "referent", null);
        setField(term5720, term5720.getClass(), "lock", term5721);
        setField(term5720, term5720.getClass(), "head", null);
        setLongField(term5720, term5720.getClass(), "queueLength", -6723783499250797216L);
        setField(term5719, term5719.getClass(), "queue", term5720);
        setField(term5719, term5719.getClass(), "next", null);
        setField(term5719, term5719.getClass(), "discovered", null);
        setField(term5697, term5697.getClass(), "shadowChildrenRef", term5719);
        setField(term5697, term5697.getClass(), "childNodes", term5723);
        setIntField(term5727, term5727.getClass(), "size", 584893196);
        setField(term5727, term5727.getClass(), "keys", term5729);
        setField(term5727, term5727.getClass(), "vals", term5730);
        setField(term5697, term5697.getClass(), "attributes", term5727);
        setField(term5697, term5697.getClass(), "baseUri", "JppkknKVOw");
        setField(term5697, term5697.getClass(), "parentNode", null);
        setIntField(term5697, term5697.getClass(), "siblingIndex", 497269071);
        term5744 = new Integer(-1899301124);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5744;
        callMethod(klass, "getElementsByIndexEquals", argTypes, term5697, args);
    }

};


