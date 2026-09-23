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

public class Element_doClone_438653594108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55637;

    public Element_doClone_438653594108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term55663 = new ArrayList();
        ((ArrayList) term55663).add((Object)null);
        ((ArrayList) term55663).add((Object)null);
        ((ArrayList) term55663).add((Object)null);
        ((ArrayList) term55663).add((Object)null);
        ((ArrayList) term55663).add((Object)null);
        term55637 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term55638 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term55659 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term55660 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term55661 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term55667 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term55669 = (Object[]) newArray("java.lang.String", 0);
        Object[] term55670 = (Object[]) newArray("java.lang.String", 0);
        setField(term55638, term55638.getClass(), "tagName", "pvDEABOxLt");
        setBooleanField(term55638, term55638.getClass(), "isBlock", true);
        setBooleanField(term55638, term55638.getClass(), "formatAsBlock", false);
        setBooleanField(term55638, term55638.getClass(), "canContainInline", true);
        setBooleanField(term55638, term55638.getClass(), "empty", true);
        setBooleanField(term55638, term55638.getClass(), "selfClosing", true);
        setBooleanField(term55638, term55638.getClass(), "preserveWhitespace", false);
        setBooleanField(term55638, term55638.getClass(), "formList", false);
        setBooleanField(term55638, term55638.getClass(), "formSubmit", true);
        setField(term55637, term55637.getClass(), "tag", term55638);
        setField(term55659, term55659.getClass(), "referent", null);
        setField(term55660, term55660.getClass(), "lock", term55661);
        setField(term55660, term55660.getClass(), "head", null);
        setLongField(term55660, term55660.getClass(), "queueLength", -1832940336320585644L);
        setField(term55659, term55659.getClass(), "queue", term55660);
        setField(term55659, term55659.getClass(), "next", null);
        setField(term55659, term55659.getClass(), "discovered", null);
        setField(term55637, term55637.getClass(), "shadowChildrenRef", term55659);
        setField(term55637, term55637.getClass(), "childNodes", term55663);
        setIntField(term55667, term55667.getClass(), "size", 1236004505);
        setField(term55667, term55667.getClass(), "keys", term55669);
        setField(term55667, term55667.getClass(), "vals", term55670);
        setField(term55637, term55637.getClass(), "attributes", term55667);
        setField(term55637, term55637.getClass(), "baseUri", "beAMpkroCQ");
        setField(term55637, term55637.getClass(), "parentNode", null);
        setIntField(term55637, term55637.getClass(), "siblingIndex", 1050765721);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "doClone", argTypes, term55637, args);
    }

};


