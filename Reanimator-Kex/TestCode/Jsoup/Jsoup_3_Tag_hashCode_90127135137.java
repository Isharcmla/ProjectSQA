package org.jsoup.parser;

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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class Tag_hashCode_90127135137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term959;
     Object term3515;

    public Tag_hashCode_90127135137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term988 = new ArrayList();
        ((ArrayList) term988).add((Object)null);
        ((ArrayList) term988).add((Object)null);
        ((ArrayList) term988).add((Object)null);
        ((ArrayList) term988).add((Object)null);
        ((ArrayList) term988).add((Object)null);
        Object term980 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term980, term980.getClass(), "tagName", "");
        setBooleanField(term980, term980.getClass(), "isBlock", true);
        setBooleanField(term980, term980.getClass(), "canContainBlock", true);
        setBooleanField(term980, term980.getClass(), "canContainInline", true);
        setBooleanField(term980, term980.getClass(), "optionalClosing", false);
        setBooleanField(term980, term980.getClass(), "empty", true);
        setBooleanField(term980, term980.getClass(), "preserveWhitespace", false);
        setField(term980, term980.getClass(), "ancestors", term988);
        ArrayList term999 = new ArrayList();
        ((ArrayList) term999).add((Object)null);
        ((ArrayList) term999).add((Object)null);
        ((ArrayList) term999).add((Object)null);
        ((ArrayList) term999).add((Object)null);
        ((ArrayList) term999).add((Object)null);
        ((ArrayList) term999).add((Object)null);
        Object term991 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term991, term991.getClass(), "tagName", "");
        setBooleanField(term991, term991.getClass(), "isBlock", true);
        setBooleanField(term991, term991.getClass(), "canContainBlock", false);
        setBooleanField(term991, term991.getClass(), "canContainInline", true);
        setBooleanField(term991, term991.getClass(), "optionalClosing", true);
        setBooleanField(term991, term991.getClass(), "empty", true);
        setBooleanField(term991, term991.getClass(), "preserveWhitespace", false);
        setField(term991, term991.getClass(), "ancestors", term999);
        ArrayList term1010 = new ArrayList();
        ((ArrayList) term1010).add((Object)null);
        ((ArrayList) term1010).add((Object)null);
        ((ArrayList) term1010).add((Object)null);
        ((ArrayList) term1010).add((Object)null);
        ((ArrayList) term1010).add((Object)null);
        Object term1002 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1002, term1002.getClass(), "tagName", "");
        setBooleanField(term1002, term1002.getClass(), "isBlock", false);
        setBooleanField(term1002, term1002.getClass(), "canContainBlock", false);
        setBooleanField(term1002, term1002.getClass(), "canContainInline", true);
        setBooleanField(term1002, term1002.getClass(), "optionalClosing", true);
        setBooleanField(term1002, term1002.getClass(), "empty", true);
        setBooleanField(term1002, term1002.getClass(), "preserveWhitespace", false);
        setField(term1002, term1002.getClass(), "ancestors", term1010);
        ArrayList term1021 = new ArrayList();
        ((ArrayList) term1021).add((Object)null);
        ((ArrayList) term1021).add((Object)null);
        ((ArrayList) term1021).add((Object)null);
        ((ArrayList) term1021).add((Object)null);
        ((ArrayList) term1021).add((Object)null);
        ((ArrayList) term1021).add((Object)null);
        Object term1013 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1013, term1013.getClass(), "tagName", "");
        setBooleanField(term1013, term1013.getClass(), "isBlock", false);
        setBooleanField(term1013, term1013.getClass(), "canContainBlock", true);
        setBooleanField(term1013, term1013.getClass(), "canContainInline", true);
        setBooleanField(term1013, term1013.getClass(), "optionalClosing", false);
        setBooleanField(term1013, term1013.getClass(), "empty", false);
        setBooleanField(term1013, term1013.getClass(), "preserveWhitespace", false);
        setField(term1013, term1013.getClass(), "ancestors", term1021);
        ArrayList term978 = new ArrayList();
        ((ArrayList) term978).add(term980);
        ((ArrayList) term978).add(term991);
        ((ArrayList) term978).add(term1002);
        ((ArrayList) term978).add(term1013);
        term959 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term959, term959.getClass(), "tagName", "XOiDvlDhdc");
        setBooleanField(term959, term959.getClass(), "isBlock", false);
        setBooleanField(term959, term959.getClass(), "canContainBlock", false);
        setBooleanField(term959, term959.getClass(), "canContainInline", true);
        setBooleanField(term959, term959.getClass(), "optionalClosing", false);
        setBooleanField(term959, term959.getClass(), "empty", true);
        setBooleanField(term959, term959.getClass(), "preserveWhitespace", true);
        setField(term959, term959.getClass(), "ancestors", term978);
        ArrayList term3522 = new ArrayList();
        ((ArrayList) term3522).add((Object)null);
        ((ArrayList) term3522).add((Object)null);
        ((ArrayList) term3522).add((Object)null);
        ((ArrayList) term3522).add((Object)null);
        ((ArrayList) term3522).add((Object)null);
        Object term3520 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3520, term3520.getClass(), "tagName", "");
        setBooleanField(term3520, term3520.getClass(), "isBlock", true);
        setBooleanField(term3520, term3520.getClass(), "canContainBlock", true);
        setBooleanField(term3520, term3520.getClass(), "canContainInline", true);
        setBooleanField(term3520, term3520.getClass(), "optionalClosing", false);
        setBooleanField(term3520, term3520.getClass(), "empty", true);
        setBooleanField(term3520, term3520.getClass(), "preserveWhitespace", false);
        setField(term3520, term3520.getClass(), "ancestors", term3522);
        ArrayList term3525 = new ArrayList();
        ((ArrayList) term3525).add((Object)null);
        ((ArrayList) term3525).add((Object)null);
        ((ArrayList) term3525).add((Object)null);
        ((ArrayList) term3525).add((Object)null);
        ((ArrayList) term3525).add((Object)null);
        ((ArrayList) term3525).add((Object)null);
        Object term3523 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3523, term3523.getClass(), "tagName", "");
        setBooleanField(term3523, term3523.getClass(), "isBlock", true);
        setBooleanField(term3523, term3523.getClass(), "canContainBlock", false);
        setBooleanField(term3523, term3523.getClass(), "canContainInline", true);
        setBooleanField(term3523, term3523.getClass(), "optionalClosing", true);
        setBooleanField(term3523, term3523.getClass(), "empty", true);
        setBooleanField(term3523, term3523.getClass(), "preserveWhitespace", false);
        setField(term3523, term3523.getClass(), "ancestors", term3525);
        ArrayList term3528 = new ArrayList();
        ((ArrayList) term3528).add((Object)null);
        ((ArrayList) term3528).add((Object)null);
        ((ArrayList) term3528).add((Object)null);
        ((ArrayList) term3528).add((Object)null);
        ((ArrayList) term3528).add((Object)null);
        Object term3526 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3526, term3526.getClass(), "tagName", "");
        setBooleanField(term3526, term3526.getClass(), "isBlock", false);
        setBooleanField(term3526, term3526.getClass(), "canContainBlock", false);
        setBooleanField(term3526, term3526.getClass(), "canContainInline", true);
        setBooleanField(term3526, term3526.getClass(), "optionalClosing", true);
        setBooleanField(term3526, term3526.getClass(), "empty", true);
        setBooleanField(term3526, term3526.getClass(), "preserveWhitespace", false);
        setField(term3526, term3526.getClass(), "ancestors", term3528);
        ArrayList term3531 = new ArrayList();
        ((ArrayList) term3531).add((Object)null);
        ((ArrayList) term3531).add((Object)null);
        ((ArrayList) term3531).add((Object)null);
        ((ArrayList) term3531).add((Object)null);
        ((ArrayList) term3531).add((Object)null);
        ((ArrayList) term3531).add((Object)null);
        Object term3529 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3529, term3529.getClass(), "tagName", "");
        setBooleanField(term3529, term3529.getClass(), "isBlock", false);
        setBooleanField(term3529, term3529.getClass(), "canContainBlock", true);
        setBooleanField(term3529, term3529.getClass(), "canContainInline", true);
        setBooleanField(term3529, term3529.getClass(), "optionalClosing", false);
        setBooleanField(term3529, term3529.getClass(), "empty", false);
        setBooleanField(term3529, term3529.getClass(), "preserveWhitespace", false);
        setField(term3529, term3529.getClass(), "ancestors", term3531);
        ArrayList term3518 = new ArrayList();
        ((ArrayList) term3518).add(term3520);
        ((ArrayList) term3518).add(term3523);
        ((ArrayList) term3518).add(term3526);
        ((ArrayList) term3518).add(term3529);
        term3515 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3515, term3515.getClass(), "tagName", "XOiDvlDhdc");
        setBooleanField(term3515, term3515.getClass(), "isBlock", false);
        setBooleanField(term3515, term3515.getClass(), "canContainBlock", false);
        setBooleanField(term3515, term3515.getClass(), "canContainInline", true);
        setBooleanField(term3515, term3515.getClass(), "optionalClosing", false);
        setBooleanField(term3515, term3515.getClass(), "empty", true);
        setBooleanField(term3515, term3515.getClass(), "preserveWhitespace", true);
        setField(term3515, term3515.getClass(), "ancestors", term3518);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term959, args);
        assertTrue(recursiveEquals(term959, term3515));
        assertTrue(recursiveEquals(retValue, 246946327));
    }

};


