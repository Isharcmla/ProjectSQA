package org.apache.commons.math.linear;

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
import org.apache.commons.math.linear.MatrixIndexException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class RealMatrixImpl_getRowMatrix_188365799068 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2120;
     Object term2224;

    public RealMatrixImpl_getRowMatrix_188365799068() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2120 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term2121 = (Object[]) newArray("[D", 8);
        double[] term2122 = (double[]) newDoubleArray(8);
        double[] term2131 = (double[]) newDoubleArray(7);
        double[] term2139 = (double[]) newDoubleArray(7);
        double[] term2147 = (double[]) newDoubleArray(7);
        double[] term2155 = (double[]) newDoubleArray(9);
        double[] term2165 = (double[]) newDoubleArray(2);
        double[] term2168 = (double[]) newDoubleArray(3);
        double[] term2172 = (double[]) newDoubleArray(9);
        Object[] term2182 = (Object[]) newArray("[D", 5);
        double[] term2183 = (double[]) newDoubleArray(5);
        double[] term2189 = (double[]) newDoubleArray(5);
        double[] term2195 = (double[]) newDoubleArray(4);
        double[] term2200 = (double[]) newDoubleArray(7);
        double[] term2208 = (double[]) newDoubleArray(8);
        int[] term2217 = (int[]) newIntArray(5);
        setDoubleElement(term2122, 0, 0.6965590169168311);
        setDoubleElement(term2122, 1, 0.33472159894348086);
        setDoubleElement(term2122, 2, 0.2698328402687743);
        setDoubleElement(term2122, 3, 0.873043035203148);
        setDoubleElement(term2122, 4, 0.5932535509159211);
        setDoubleElement(term2122, 5, 0.059611302990266846);
        setDoubleElement(term2122, 6, 0.29225699525915894);
        setDoubleElement(term2122, 7, 0.39653472969283077);
        setElement(term2121, 0, term2122);
        setDoubleElement(term2131, 0, 0.15055062571842626);
        setDoubleElement(term2131, 1, 0.2849157687292415);
        setDoubleElement(term2131, 2, 0.5197346036604176);
        setDoubleElement(term2131, 3, 0.3821023664998483);
        setDoubleElement(term2131, 4, 0.6584787211782301);
        setDoubleElement(term2131, 5, 0.1937075341828559);
        setDoubleElement(term2131, 6, 0.44682046821312316);
        setElement(term2121, 1, term2131);
        setDoubleElement(term2139, 0, 0.8323532236646399);
        setDoubleElement(term2139, 1, 0.6397358922018691);
        setDoubleElement(term2139, 2, 0.9066998853505908);
        setDoubleElement(term2139, 3, 0.05083782629282396);
        setDoubleElement(term2139, 4, 0.6695336994403062);
        setDoubleElement(term2139, 5, 0.34363635678920734);
        setDoubleElement(term2139, 6, 0.28707058137195374);
        setElement(term2121, 2, term2139);
        setDoubleElement(term2147, 0, 0.584132621410495);
        setDoubleElement(term2147, 1, 0.5308945693939473);
        setDoubleElement(term2147, 2, 0.3326214440098766);
        setDoubleElement(term2147, 3, 0.42989847076296206);
        setDoubleElement(term2147, 4, 0.8605802060060375);
        setDoubleElement(term2147, 5, 0.746182708698679);
        setDoubleElement(term2147, 6, 0.43468122773144435);
        setElement(term2121, 3, term2147);
        setDoubleElement(term2155, 0, 0.30316310060633844);
        setDoubleElement(term2155, 1, 0.45666264951111046);
        setDoubleElement(term2155, 2, 0.6463368736569162);
        setDoubleElement(term2155, 3, 0.35554035462293654);
        setDoubleElement(term2155, 4, 0.6605765366899409);
        setDoubleElement(term2155, 5, 0.34606826774619304);
        setDoubleElement(term2155, 6, 0.208911877309652);
        setDoubleElement(term2155, 7, 0.6712198198383964);
        setDoubleElement(term2155, 8, 0.6560878972868479);
        setElement(term2121, 4, term2155);
        setDoubleElement(term2165, 0, 0.49164780269698416);
        setDoubleElement(term2165, 1, 0.05844959776072378);
        setElement(term2121, 5, term2165);
        setDoubleElement(term2168, 0, 0.7545938732933054);
        setDoubleElement(term2168, 1, 0.555720831263745);
        setDoubleElement(term2168, 2, 0.8296938655870651);
        setElement(term2121, 6, term2168);
        setDoubleElement(term2172, 0, 0.008961627061484845);
        setDoubleElement(term2172, 1, 0.42881950761081433);
        setDoubleElement(term2172, 2, 0.5644745329624891);
        setDoubleElement(term2172, 3, 0.8988938672874076);
        setDoubleElement(term2172, 4, 0.6608826669219873);
        setDoubleElement(term2172, 5, 0.7860233123966477);
        setDoubleElement(term2172, 6, 0.06433964340439391);
        setDoubleElement(term2172, 7, 0.08993892686283389);
        setDoubleElement(term2172, 8, 0.04630019236601257);
        setElement(term2121, 7, term2172);
        setField(term2120, term2120.getClass(), "data", term2121);
        setDoubleElement(term2183, 0, 0.6613885474313168);
        setDoubleElement(term2183, 1, 0.494050019899438);
        setDoubleElement(term2183, 2, 0.12165424271232805);
        setDoubleElement(term2183, 3, 0.9539599355783924);
        setDoubleElement(term2183, 4, 0.710793359488993);
        setElement(term2182, 0, term2183);
        setDoubleElement(term2189, 0, 0.6920122631901948);
        setDoubleElement(term2189, 1, 0.8856493266514555);
        setDoubleElement(term2189, 2, 0.35949348580116536);
        setDoubleElement(term2189, 3, 0.9044080113158133);
        setDoubleElement(term2189, 4, 0.7709248376486527);
        setElement(term2182, 1, term2189);
        setDoubleElement(term2195, 0, 0.24386896688203952);
        setDoubleElement(term2195, 1, 0.33650824379057453);
        setDoubleElement(term2195, 2, 0.5191680850819778);
        setDoubleElement(term2195, 3, 0.49591925980210916);
        setElement(term2182, 2, term2195);
        setDoubleElement(term2200, 0, 0.7120592018058269);
        setDoubleElement(term2200, 1, 0.9306262668515027);
        setDoubleElement(term2200, 2, 0.3897971128913206);
        setDoubleElement(term2200, 3, 0.697625539365438);
        setDoubleElement(term2200, 4, 0.2170446731874749);
        setDoubleElement(term2200, 5, 0.7412534377270371);
        setDoubleElement(term2200, 6, 0.2610608910723019);
        setElement(term2182, 3, term2200);
        setDoubleElement(term2208, 0, 0.46738526389049295);
        setDoubleElement(term2208, 1, 0.2768470919610353);
        setDoubleElement(term2208, 2, 0.3748057502836176);
        setDoubleElement(term2208, 3, 0.5731930829917865);
        setDoubleElement(term2208, 4, 0.7539051746561026);
        setDoubleElement(term2208, 5, 0.02005712174177421);
        setDoubleElement(term2208, 6, 0.5083146266420581);
        setDoubleElement(term2208, 7, 0.9079395441784993);
        setElement(term2182, 4, term2208);
        setField(term2120, term2120.getClass(), "lu", term2182);
        setIntElement(term2217, 0, 941650513);
        setIntElement(term2217, 1, 444029505);
        setIntElement(term2217, 2, -1034506028);
        setIntElement(term2217, 3, -1263114719);
        setIntElement(term2217, 4, -894662986);
        setField(term2120, term2120.getClass(), "permutation", term2217);
        setIntField(term2120, term2120.getClass(), "parity", 1);
        term2224 = new Integer(304775596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2224;
        try {
            callMethod(klass, "getRowMatrix", argTypes, term2120, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


