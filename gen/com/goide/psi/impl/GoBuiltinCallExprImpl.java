// This is a generated file. Not intended for manual editing.
package com.goide.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.goide.GoTypes.*;
import com.goide.psi.*;

public class GoBuiltinCallExprImpl extends GoExpressionImpl implements GoBuiltinCallExpr {

  public GoBuiltinCallExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GoVisitor visitor) {
    visitor.visitBuiltinCallExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GoVisitor) accept((GoVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GoBuiltinArgs getBuiltinArgs() {
    return findChildByClass(GoBuiltinArgs.class);
  }

  @Override
  @NotNull
  public GoReferenceExpression getReferenceExpression() {
    return findNotNullChildByClass(GoReferenceExpression.class);
  }

  @Override
  @Nullable
  public PsiElement getComma() {
    return findChildByType(COMMA);
  }

  @Override
  @NotNull
  public PsiElement getLparen() {
    return findNotNullChildByType(LPAREN);
  }

  @Override
  @Nullable
  public PsiElement getRparen() {
    return findChildByType(RPAREN);
  }

}
