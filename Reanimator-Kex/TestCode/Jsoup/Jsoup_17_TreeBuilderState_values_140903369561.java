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
import java.lang.Object;
import java.lang.String;

public class TreeBuilderState_values_140903369561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95979;

    public TreeBuilderState_values_140903369561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term96302 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term96301 = ((Class) term96302).getDeclaredField((String) "Initial");
        ((Field) term96301).setAccessible(true);
        Object enum173 = ((Field) term96301).get((Object) null);
        Class<? extends Object> term96495 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term96494 = ((Class) term96495).getDeclaredField((String) "BeforeHtml");
        ((Field) term96494).setAccessible(true);
        Object enum174 = ((Field) term96494).get((Object) null);
        Class<? extends Object> term96697 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term96696 = ((Class) term96697).getDeclaredField((String) "BeforeHead");
        ((Field) term96696).setAccessible(true);
        Object enum175 = ((Field) term96696).get((Object) null);
        Class<? extends Object> term96899 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term96898 = ((Class) term96899).getDeclaredField((String) "InHead");
        ((Field) term96898).setAccessible(true);
        Object enum176 = ((Field) term96898).get((Object) null);
        Class<? extends Object> term97089 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term97088 = ((Class) term97089).getDeclaredField((String) "InHeadNoscript");
        ((Field) term97088).setAccessible(true);
        Object enum177 = ((Field) term97088).get((Object) null);
        Class<? extends Object> term97303 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term97302 = ((Class) term97303).getDeclaredField((String) "AfterHead");
        ((Field) term97302).setAccessible(true);
        Object enum178 = ((Field) term97302).get((Object) null);
        Class<? extends Object> term97502 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term97501 = ((Class) term97502).getDeclaredField((String) "InBody");
        ((Field) term97501).setAccessible(true);
        Object enum179 = ((Field) term97501).get((Object) null);
        Class<? extends Object> term97692 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term97691 = ((Class) term97692).getDeclaredField((String) "Text");
        ((Field) term97691).setAccessible(true);
        Object enum180 = ((Field) term97691).get((Object) null);
        Class<? extends Object> term97876 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term97875 = ((Class) term97876).getDeclaredField((String) "InTable");
        ((Field) term97875).setAccessible(true);
        Object enum181 = ((Field) term97875).get((Object) null);
        Class<? extends Object> term98069 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term98068 = ((Class) term98069).getDeclaredField((String) "InTableText");
        ((Field) term98068).setAccessible(true);
        Object enum182 = ((Field) term98068).get((Object) null);
        Class<? extends Object> term98274 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term98273 = ((Class) term98274).getDeclaredField((String) "InCaption");
        ((Field) term98273).setAccessible(true);
        Object enum183 = ((Field) term98273).get((Object) null);
        Class<? extends Object> term98473 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term98472 = ((Class) term98473).getDeclaredField((String) "InColumnGroup");
        ((Field) term98472).setAccessible(true);
        Object enum184 = ((Field) term98472).get((Object) null);
        Class<? extends Object> term98684 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term98683 = ((Class) term98684).getDeclaredField((String) "InTableBody");
        ((Field) term98683).setAccessible(true);
        Object enum185 = ((Field) term98683).get((Object) null);
        Class<? extends Object> term98889 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term98888 = ((Class) term98889).getDeclaredField((String) "InRow");
        ((Field) term98888).setAccessible(true);
        Object enum186 = ((Field) term98888).get((Object) null);
        Class<? extends Object> term99076 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term99075 = ((Class) term99076).getDeclaredField((String) "InCell");
        ((Field) term99075).setAccessible(true);
        Object enum187 = ((Field) term99075).get((Object) null);
        Class<? extends Object> term99266 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term99265 = ((Class) term99266).getDeclaredField((String) "InSelect");
        ((Field) term99265).setAccessible(true);
        Object enum188 = ((Field) term99265).get((Object) null);
        Class<? extends Object> term99462 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term99461 = ((Class) term99462).getDeclaredField((String) "InSelectInTable");
        ((Field) term99461).setAccessible(true);
        Object enum189 = ((Field) term99461).get((Object) null);
        Class<? extends Object> term99679 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term99678 = ((Class) term99679).getDeclaredField((String) "AfterBody");
        ((Field) term99678).setAccessible(true);
        Object enum190 = ((Field) term99678).get((Object) null);
        Class<? extends Object> term99878 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term99877 = ((Class) term99878).getDeclaredField((String) "InFrameset");
        ((Field) term99877).setAccessible(true);
        Object enum191 = ((Field) term99877).get((Object) null);
        Class<? extends Object> term100080 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term100079 = ((Class) term100080).getDeclaredField((String) "AfterFrameset");
        ((Field) term100079).setAccessible(true);
        Object enum192 = ((Field) term100079).get((Object) null);
        Class<? extends Object> term100291 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term100290 = ((Class) term100291).getDeclaredField((String) "AfterAfterBody");
        ((Field) term100290).setAccessible(true);
        Object enum193 = ((Field) term100290).get((Object) null);
        Class<? extends Object> term100505 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term100504 = ((Class) term100505).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term100504).setAccessible(true);
        Object enum194 = ((Field) term100504).get((Object) null);
        Class<? extends Object> term100731 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term100730 = ((Class) term100731).getDeclaredField((String) "ForeignContent");
        ((Field) term100730).setAccessible(true);
        Object enum195 = ((Field) term100730).get((Object) null);
        term95979 = (Object[]) newArray("org.jsoup.parser.TreeBuilderState", 23);
        setElement(term95979, 0, enum173);
        setElement(term95979, 1, enum174);
        setElement(term95979, 2, enum175);
        setElement(term95979, 3, enum176);
        setElement(term95979, 4, enum177);
        setElement(term95979, 5, enum178);
        setElement(term95979, 6, enum179);
        setElement(term95979, 7, enum180);
        setElement(term95979, 8, enum181);
        setElement(term95979, 9, enum182);
        setElement(term95979, 10, enum183);
        setElement(term95979, 11, enum184);
        setElement(term95979, 12, enum185);
        setElement(term95979, 13, enum186);
        setElement(term95979, 14, enum187);
        setElement(term95979, 15, enum188);
        setElement(term95979, 16, enum189);
        setElement(term95979, 17, enum190);
        setElement(term95979, 18, enum191);
        setElement(term95979, 19, enum192);
        setElement(term95979, 20, enum193);
        setElement(term95979, 21, enum194);
        setElement(term95979, 22, enum195);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term95979));
    }

};


