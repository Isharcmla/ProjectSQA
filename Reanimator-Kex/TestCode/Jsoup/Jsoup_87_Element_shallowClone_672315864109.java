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

public class Element_shallowClone_672315864109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55759;

    public Element_shallowClone_672315864109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term55785 = new ArrayList();
        ((ArrayList) term55785).add((Object)null);
        ((ArrayList) term55785).add((Object)null);
        ((ArrayList) term55785).add((Object)null);
        ((ArrayList) term55785).add((Object)null);
        term55759 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term55760 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term55781 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term55782 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term55783 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term55789 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term55791 = (Object[]) newArray("java.lang.String", 0);
        Object[] term55792 = (Object[]) newArray("java.lang.String", 0);
        setField(term55760, term55760.getClass(), "tagName", "uSUvKAyuvd");
        setBooleanField(term55760, term55760.getClass(), "isBlock", true);
        setBooleanField(term55760, term55760.getClass(), "formatAsBlock", true);
        setBooleanField(term55760, term55760.getClass(), "canContainInline", false);
        setBooleanField(term55760, term55760.getClass(), "empty", false);
        setBooleanField(term55760, term55760.getClass(), "selfClosing", true);
        setBooleanField(term55760, term55760.getClass(), "preserveWhitespace", true);
        setBooleanField(term55760, term55760.getClass(), "formList", false);
        setBooleanField(term55760, term55760.getClass(), "formSubmit", false);
        setField(term55759, term55759.getClass(), "tag", term55760);
        setField(term55781, term55781.getClass(), "referent", null);
        setField(term55782, term55782.getClass(), "lock", term55783);
        setField(term55782, term55782.getClass(), "head", null);
        setLongField(term55782, term55782.getClass(), "queueLength", -8033714905181142681L);
        setField(term55781, term55781.getClass(), "queue", term55782);
        setField(term55781, term55781.getClass(), "next", null);
        setField(term55781, term55781.getClass(), "discovered", null);
        setField(term55759, term55759.getClass(), "shadowChildrenRef", term55781);
        setField(term55759, term55759.getClass(), "childNodes", term55785);
        setIntField(term55789, term55789.getClass(), "size", -1697741155);
        setField(term55789, term55789.getClass(), "keys", term55791);
        setField(term55789, term55789.getClass(), "vals", term55792);
        setField(term55759, term55759.getClass(), "attributes", term55789);
        setField(term55759, term55759.getClass(), "baseUri", "onQLVONGuf");
        setField(term55759, term55759.getClass(), "parentNode", null);
        setIntField(term55759, term55759.getClass(), "siblingIndex", 1295839803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "shallowClone", argTypes, term55759, args);
    }

};


