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

public class Element_getElementsByAttributeValueNot_183337612365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4766;

    public Element_getElementsByAttributeValueNot_183337612365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4792 = new ArrayList();
        ((ArrayList) term4792).add((Object)null);
        ((ArrayList) term4792).add((Object)null);
        ((ArrayList) term4792).add((Object)null);
        ((ArrayList) term4792).add((Object)null);
        ((ArrayList) term4792).add((Object)null);
        ((ArrayList) term4792).add((Object)null);
        ((ArrayList) term4792).add((Object)null);
        ((ArrayList) term4792).add((Object)null);
        ((ArrayList) term4792).add((Object)null);
        term4766 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4767 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4788 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term4789 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term4790 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term4796 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term4798 = (Object[]) newArray("java.lang.String", 0);
        Object[] term4799 = (Object[]) newArray("java.lang.String", 0);
        setField(term4767, term4767.getClass(), "tagName", "aNWLJdrZMq");
        setBooleanField(term4767, term4767.getClass(), "isBlock", false);
        setBooleanField(term4767, term4767.getClass(), "formatAsBlock", false);
        setBooleanField(term4767, term4767.getClass(), "canContainInline", false);
        setBooleanField(term4767, term4767.getClass(), "empty", true);
        setBooleanField(term4767, term4767.getClass(), "selfClosing", false);
        setBooleanField(term4767, term4767.getClass(), "preserveWhitespace", false);
        setBooleanField(term4767, term4767.getClass(), "formList", true);
        setBooleanField(term4767, term4767.getClass(), "formSubmit", true);
        setField(term4766, term4766.getClass(), "tag", term4767);
        setField(term4788, term4788.getClass(), "referent", null);
        setField(term4789, term4789.getClass(), "lock", term4790);
        setField(term4789, term4789.getClass(), "head", null);
        setLongField(term4789, term4789.getClass(), "queueLength", -1610676979013636850L);
        setField(term4788, term4788.getClass(), "queue", term4789);
        setField(term4788, term4788.getClass(), "next", null);
        setField(term4788, term4788.getClass(), "discovered", null);
        setField(term4766, term4766.getClass(), "shadowChildrenRef", term4788);
        setField(term4766, term4766.getClass(), "childNodes", term4792);
        setIntField(term4796, term4796.getClass(), "size", -2015854073);
        setField(term4796, term4796.getClass(), "keys", term4798);
        setField(term4796, term4796.getClass(), "vals", term4799);
        setField(term4766, term4766.getClass(), "attributes", term4796);
        setField(term4766, term4766.getClass(), "baseUri", "HHmNoYxIGj");
        setField(term4766, term4766.getClass(), "parentNode", null);
        setIntField(term4766, term4766.getClass(), "siblingIndex", 538259104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "PtirvZmsGt";
        args[1] = "HWkpTmtlrc";
        callMethod(klass, "getElementsByAttributeValueNot", argTypes, term4766, args);
    }

};


